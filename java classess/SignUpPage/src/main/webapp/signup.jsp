<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forms</title>
</head>
<body>
<pre>
<span style="color:green">${id}${success }</span>
<span style="color:red">${dto}${failure }</span>
<h1>Sign-Up forms</h1>

<form action="signup" method="post">
<br>
UserId<input type="text" name="userId"/><br>
Email<input type="text" name="email"/><br>
Password<input type="text" name="password"/><br>
ConfirmPassword<input type="password" name="confirmPassword"/><br>
<input type="submit" value="signup"/>
</form>
<h1>${ABC},${userid}${success}</h1>
<h2>${failure}</h2>
</pre>
</body>
</html>

