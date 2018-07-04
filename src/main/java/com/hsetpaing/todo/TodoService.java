package com.hsetpaing.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application Development","Study"));
		todos.add(new Todo("Learn Spring MVC","Learning"));
		todos.add(new Todo("Learn Spring Rest Services","Tutuorial"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void delTodo(Todo todo) {
		todos.remove(todo);
	}
}
