<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
		
		<h2>
			
			core tag
		</h2>
		
		<c:set var="name" value="This is the core tag!!"></c:set>
		<c:out value="${name}"></c:out>
	

</body>
</html>