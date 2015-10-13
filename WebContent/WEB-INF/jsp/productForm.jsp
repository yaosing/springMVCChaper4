<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<form:errors path="date"/>
		<p>
			<label for="date">Date:</label>
			<input type="text"  id="date" name="date" tabindex = "4">
		</p>
		
		<p>
			<input type="reset" id="reset" tabindex="5">
			<input type="submit" id="submit" tabindex="6" value="addProduct">
		</p>
	</form>
	<hr>
		<form:form  commandName="employee" action="employee_save" method="post">
		<form:errors path="date"/>
		<p>
			<label for="date">Date:</label>
			<form:input path="date"/>
		</p>
		
		<p>
			<input type="reset" id="reset" >
			<input type="submit" id="submit"  value="addEmployee">
		</p>
	</form:form>
</body>
</html>