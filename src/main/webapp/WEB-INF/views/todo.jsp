<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To-Dos List</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body style="background-color: powderblue; font-family: verdana">

	<div class="container">

		<h3>Add a To-Do</h3>

		<form method="post">

			<fieldset class="form-group">
				<label>Description</label> <input type="text" name="description"
					placeholder="Add description" class="form-control" required="required" />
			</fieldset>
			<br> <input class="btn btn-success" type="submit" value="Submit" />
		</form>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>