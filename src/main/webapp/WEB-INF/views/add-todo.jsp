<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<div class="container">
		<H3>Welcome ${name}</H3>
		<p>Your New Todo</p>

		<form action="add-todo.do" method="post">
			<fieldset class="form-group">
				<label>Description</label> 
				<input type="text" name="todo" class="form-control"/>
			</fieldset>
			<fieldset class="form-group">
				<label>Category</label> 
				<input type="text" name="category" class="form-control"/>
			</fieldset>
			<fieldset class="form-group">
				<input type="submit" value="Summit" class="btn btn-success"/>
			</fieldset>
		</form>
	</div>
<%@ include file="../common/footer.jspf" %>
	