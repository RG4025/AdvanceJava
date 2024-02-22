<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
  
  	<div clasd="container">
  		<div class="container">
  		<form action="FormHandle.jsp" method="post">
				  <div class="mb-3">
				    <label for="name" class="form-label">Your Name</label>
				    <input type="text" class="form-control" id="" name="name">
				  </div>
				  <div class="mb-3">
				    <label for="age" class="form-label">Age</label>
				    <input type="text" class="form-control" id="" name="age">
				  </div>
				  <div class="mb-3 form-check">
				    <label for="address" class="form-label">Your Address</label>
				    <input type="text" class="form-control" id="" name="address">
				  </div>
				  <div class="mb-3 form-check">
				    <label for="email" class="form-label">Your Email</label>
				    <input type="email" class="form-control" id="" name="email">
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
  	
  		</div>
  	</div>
  
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>