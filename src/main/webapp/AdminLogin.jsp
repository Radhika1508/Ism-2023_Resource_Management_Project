<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body {
  background-color: #f8f8f8;
  font-family: Arial, sans-serif;
}

.login-container {
  width: 360px;
  margin: 100px auto;
  padding: 20px;
  background-color: #FFFFFF;
  box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
  border-radius: 10px;
}

h1 {
  text-align: center;
  color:	#000000;
  
}

.login-form {
  margin-top: 20px;
}

input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: none;
  border-bottom: 1px solid #ccc;
  background-color: #FFFFFF;
  outline: none;
}

input[type="text"]::placeholder,
input[type="password"]::placeholder {
  color: #000000;
}

button {
  width: 100%;
  padding: 12px;
  background-color: 	#D2691E;
  color: #000000;
  font-size: 16px;
  font-weight: bold;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #A9A9A9;
}

.signup-link {
  margin-top: 10px;
  text-align: center;
}

.signup-link a {
  color: #007bff;
  text-decoration: none;
}

.signup-link a:hover {
  text-decoration: underline;
}


</style>
</head>
<body>

<div class="login-container">
    <h1> Admin Login</h1>
    <form class="login-form" action="AdminAuthentication" method="post">
      <input type="text" name="email" placeholder="Username">
      <input type="password" name="password" placeholder="Password">
      <button type="submit">Login</button>

    </form>
  </div>


</body>
</html>