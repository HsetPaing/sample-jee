<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<div class="container">
		<H3>Welcome ${name}</H3>
		<p>Your Todo List</p>
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a
							href="delete-todo.do?todo=${todo.name}&category=${todo.category}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form action="add-todo.do" method="post">
			<a href="add-todo.do" class="btn btn-success">Add New Todo</a>
		</form>
	</div>
<%@ include file="../common/footer.jspf" %>