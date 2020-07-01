<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body class="text-center" >
	<form action="signup" >
	<label class="sr-only">Username</label>
<input type="text" name="aname"   class="form-control" placeholder="Username" required autofocus><br>
<label class="sr-only">Password</label>
<input type="password" name="password" class="form-control" placeholder="Password" required><br>
<label class="sr-only">email</label>
<input type="email" name="email" class="form-control" placeholder="Enter email" required><br>
<label class="sr-only">Description</label>
<input type="text" name="description" class="form-control" placeholder="Personal description" required><br>
 <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
 
</form><br>
success: ${check}

</body>
</html>