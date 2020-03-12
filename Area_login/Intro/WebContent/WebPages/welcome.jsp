<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Area Calculator</title>
</head>
<body>

<h5>Howdy <%= request.getParameter("userName") %>! welcome to the <em>Area Calculator</em></h5>
	Choose the Shape and how to calculate the Area <br/>
	Circle: 	 <a href = "radius.html">radius</a>, <a href = diameter.html>diameter</a>,
			<a href = "circum.html">circumference</a>,  <a href = "a_sector.html">area of sector</a><br>
	Triangle: <a href = "triangle.html">normal area</a>

</body>
</html>