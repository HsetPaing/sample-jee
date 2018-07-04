package com.hsetpaing.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String newTodo = request.getParameter("todo"); //get todo data form todo.jsp
		String category = request.getParameter("category"); //get todo data form todo.jsp
		todoService.addTodo(new Todo(newTodo,category));//add new todo
		response.sendRedirect("list-todos.do");
		
		/*request.getSession().setAttribute("todos", todoService.retrieveTodos());//to retrieve data from TodoService
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);*/
	}

}
