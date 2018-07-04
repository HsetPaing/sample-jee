package com.hsetpaing.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsetpaing.todo.TodoService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{
	
	protected LoginService userValidationService = new LoginService();
	
	protected TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = (request.getParameter("name"));

		request.setAttribute("name", name);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isValidate = userValidationService.isUserValidate(name, password);
		
		if (isValidate) {
			/*request.setAttribute("name", name);
			request.setAttribute("todos", todoService.retrieveTodos());

			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
			request.getSession().setAttribute("name", name);
			response.sendRedirect("list-todos.do");
		}else {
			request.setAttribute("errorMessages", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}
