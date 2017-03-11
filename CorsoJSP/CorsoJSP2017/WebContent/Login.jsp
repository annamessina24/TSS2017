<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>


	<form action="VerificaLogin.jsp">

  	 <div class="container">
  	  	<label><b>Username</b></label>
   	  	<input type="text" placeholder="Enter Username" id="username" name="username" required><br/>

    	<label><b>Password</b></label>
    	<input type="password" placeholder="Enter Password" id="password" name="password" required><br/>

    	<button type="submit">Login</button>
  	</div>
  </form>

</body>
</html>