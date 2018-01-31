<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminInsert</title>
</head>
<body>
<h1 style=" text-align: center"> Admin panel</h1>
<h2>Product Insert </h2>
<form action="InsertProduct" method="post">
<br>

Product Name: 
<input type="text" name="product_name" >
<br>
Product Cost: 	
<input type="number" name="product_cost" >
<br>
Product_image1:
<input type="file" name="file_path">
<br>
Product_image2:
<input type="file" name="file_path2">
<br>
Product_image3:
<input type="file" name="file_path3">
<br>
Product_image4:
<input type="file" name="file_path4">
<br>
Product_image5:
<input type="file" name="file_path5">
<br>
Product_image6:
<input type="file" name="file_path6">
<br>
Product_image7:
<input type="file" name="file_path7">
<br>
Product_image8:
<input type="file" name="file_path8">
<br>
category_id
<select name="category_id">
  <option value="1">T-shirt</option>
  <option value="2">Shirt</option>
</select>
<br>
Product Description:
<br>
<textarea cols="10px" rows="10px" name="product_description"></textarea>
<br>
<input type="submit">

</form>
</body>
</html>