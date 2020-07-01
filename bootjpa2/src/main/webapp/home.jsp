<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addAlien">
<input type="text" name="aid"><br>
<input type="text" name="aname"><br>
 <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</form><br>
welcome ${obj}

<form action="getAlien">
<input type="text" name="aid"><br>
<br>
<input type="submit"><br>
</form>
</body>
</html>