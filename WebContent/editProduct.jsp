<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit</title>
</head>
<body>
<table>
<form action="updateProduct" method="post">
	<tr>
		<td>name</td>
		<td><input type="text" name="product.name" value="${product.name }"></td>
	</tr>
	<tr>
		<td>price</td>
		<td><input type="text" name="product.price" value="${product.price }"></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="提交">
		</td>
	</tr>
</table>
</form>
</body>
</html>