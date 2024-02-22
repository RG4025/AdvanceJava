<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="Declaration.jsp" method="post">
	
	<input type="text" placeholder="Enter Name" name="name"/>
	<button type="submit">submit</button>

</form>
	
	<%! 
		
		int salary = 1000;
	
	%>
	
	<h1>
	
	<%
		
	String name = request.getParameter("name");
	
		out.println("Hello " + name + " Tour salary is : " + salary);
	
	%>
	</h1>
	
	
	
	
	
	


</body>
</html>