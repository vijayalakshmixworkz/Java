<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
<span style="color:green"> ${ProductName} ${success} ${totalCost}  

<span style="color:red">${valid}  ${failure}   ${value} 

<h1>Home page</h1>
<form action="submitProduct" method="post">
<pre>

CompanyName<input type="text" name="companyName" value=${dto.companyName}>
ProductName<input type="text" name="productName" value =${dto.productName}>
ProductType <select name="productType"  value=${dto.productType}>
			<option>select</option>
            <option >Electronics</option>
            <option >Furniture</option>
            <option >Clothing</option>
            <option >Food</option>
            <option>Stationary</option>
        </select>
ProductQuantity<input type="number" name="productQuantity" > 
ProductCost<input type="number" name="productCost" >   
<input type="submit" value="book">   
</pre>
<span style="color:black">${dto}
</form>

</body>
</html>