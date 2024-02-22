<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>     
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>
		Working with the function tag!!
		
	</h2>
	
	<p>
	The Quick Brown Fox Jumps Over The Lazy Dog!
	
	</p>
	
	<c:set var="str" value="The Quick Brown Fox Jumps Over The Lazy Dog!"></c:set>
	
	
	<strong>	
		String in uppercase : ${fn:toUpperCase(str)};
	
	</strong>
	
	<br>
	
	<strong>	
		String in lowercase : ${fn:toLowerCase(str)};
	
	</strong>
	
	<br>
	
	<strong>	
		Length of the String : ${fn:length(str)};
	
	</strong>

</body>
</html>