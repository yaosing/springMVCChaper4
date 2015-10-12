<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">@IMPORT url("css/main.css");</style>
<title>Add a product</title>
</head>
<body>
	<form action="product_save" method="post">
		<fieldset>
			<legend>Add a product</legend>
		</fieldset>
		<p>
			<label for="name">ProductName:</label>
			<input type="text" id="name" name="name" tabindex="1">
		</p>
		
		<p>
			<label for="description">Description:</label>
			<input type="text" id="description" name="description" tabindex="2">
		</p>
		
		<p>
			<label for="price">Price:</label>
			<input type="text" id="price" name="price" tabindex="3">
		</p>
		
		<p>
			<input type="reset" id="reset" tabindex="4">
			<input type="submit" id="submit" tabindex="5" value="addProduct">
		</p>
		
	</form>
</body>
</html>