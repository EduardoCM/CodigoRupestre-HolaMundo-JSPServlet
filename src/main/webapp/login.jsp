<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Space Money</h1>

	<form action="login" method="post">

		<table>
			<tr>
				<td>User: </td>
				<td><input type="text" name="user"></td>
			</tr>

			<tr>
				<td>Password: </td>
				<td><input type="text" name="password"></td>
			</tr>
			
			<tr>
			  <td bgcolor="green">${Msj}</td>
			</tr>

			<tr>
				<td></td>
				<td><button type="submit">Login</button></td>
			</tr>
		</table>

	</form>

	<a href=newUser.jsp>Create Account</a>
	<a href="forgotPassword.jsp">Forgot Password</a>

	<br />
	<br />

	<td><a href="loginWithGoogle">Login with Google Account </a></td>

    <br />

	<td><a href="LoginWIthPayPal">Login with Paypal Account </a></td>
	
	<br />

	<td><a href="LoginWithFacebook">Login with Facebook Account</a></td>


</body>
</html>