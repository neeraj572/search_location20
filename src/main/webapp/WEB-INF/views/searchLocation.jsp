<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>enter location id to search....</h2>
<form action="find" method="post">
id<input type="text" name="id"/>
<input type="submit" value="search"/>
</form>
id:${locations.id }</br>
code:${locations.code }</br>
name:${locations.name }</br>
type: ${locations.type }</br>
</body>
</html>