<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stadium</title>
</head>
<body>
<span style="color:green"> ${stadiumName} ${Book} 

<span style="color:red">${valid}  ${failure}  
<h1>Home page</h1>
<form action="submitProduct" method="post">
<pre>
stadiumName <select name="stadiumName"  value=${dto.stadiumName}>
			<option>M. Chinnaswamy Stadium</option>
            <option >Sree Kanteerava Stadium</option>
            <option >Bangalore Football Stadium</option>
            <option >KSCA Ground (Alur)</option>
        </select>
       ticket<input type="number" name="ticket" > 
		primaryContact<input type="number" name=${dto.primaryContact}>
		email<input type="text" name="email" value=${dto.email}>
		 <input type="submit" value="book">  
		 </form> 
</pre>  
</body>
</html>
