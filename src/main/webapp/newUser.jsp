<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Crear nuevo usuario</h1>

	<form action="createUser" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age"></td>
			</tr>
			
			<tr>
				<td>user</td>
				<td><input type="text" name="user"></td>
			</tr>
			
			<tr>
			   <td>Email: </td>
			    <td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><button type="submit">Create User</button></td>
			<tr>
		</table>
	</form>
	
</body>
</html>