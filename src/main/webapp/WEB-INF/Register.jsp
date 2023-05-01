<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
body{
background-image: url('https://i.pinimg.com/736x/50/9f/e8/509fe8d46c22535526eb9c3ed2668794.jpg');
background-repeat: no-repeat;
background-size: cover;
background-attachment: fixed;
}
</style>
</head>
<body>
<center>
<form action="RegisterAction" method="post"> 

<h1 style="color: aqua;">  Welcome to Registeration</h1>

Phone No: <input type="text" name="ph"></br></br>
Firstname: <input type="text" name="fn"></br></br>
Lastname: <input type="text" name="ln"></br></br>
Email: <input type="email" name="em"></br></br>
Password: <input type="password" name="pa"></br></br>

<input type="submit" value="Register">
</form>
</center>
</body>
</html>