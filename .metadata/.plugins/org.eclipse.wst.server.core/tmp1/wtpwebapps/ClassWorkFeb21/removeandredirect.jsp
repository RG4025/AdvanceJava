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

	<c:set var="name" scope="session" value="Rushikesh"></c:set>
	
		<p>	Before removing the value :<c:out value="${name}"></c:out></p>
		
	<c:remove var="name"></c:remove>	
	
		<p>	After removing the value :<c:out value="${name}"></c:out></p>
	
	<c:set var="url" scope="request" value="0"></c:set>	
	
	<c:if test="${url < 1}">
	
		<c:redirect url="https://www.javatpoint.com/jstl-core-redirect-tag"></c:redirect>
	
	</c:if>
	
	<c:if test="${url > 1}">
	
		<c:redirect url="https://www.linkedin.com/feed/update/urn:li:activity:7164599037390794753/"></c:redirect>
	
	</c:if>
	
</body>
</html>