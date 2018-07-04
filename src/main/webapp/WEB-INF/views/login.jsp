<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
	<div class="container">
		<form action="login.do" method="post">
			<p>
				<font color="red">${errorMessages}</font>
			</p>
			<label>Name</label>
			<fieldset class="form-group">
				<input type="text" name="name" class="form-control"/>
			</fieldset>
			<label>Password</label>
			<fieldset class="form-group">
				<input type="password" name="password" class="form-control"/>
			</fieldset>
			<fieldset class="form-group">
				<input type="submit" value="login" class="btn btn-success"/>
			</fieldset>
		</form>
	</div>
<%@ include file="../common/footer.jspf" %>