<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>

<div class="container">

<div class=" fs-2 text-center text-danger">Registaration Form for Students</div>
<div class="col=md-3" style="border-radius: 3em;">
<form method="post"  class=" shadow-lg form-md bg-info"  align="center">

<caption>Student Registration Form</caption>

	<div class="mb-2">
		<!-- <label for="sname" class="form-label">Student Name</label> -->
		<input class="form-contorl" type="text" name="sname"  id="sname" placeholder="Student Name"  style="border-radius: 6px;"/>
		</div>

	<div class="mb-2">
	<!-- <label for="sadd" class="form-label">Student Address</label> -->
	<input class="form-contorl" type="text" name="sadd" placeholder="Student Address" style="border-radius:6px;"/>
	</div>
	
	<div class="mb-2">
	<!-- <label for="sclass" class="form-label">Student class</label> -->
	<input class="form-contorl" type="text" name="sclass" placeholder="Student Class" style="border-radius:6px;"/>
	</div>
	
	<div class="mb-2">
<!-- 	<label for="smobile" class="form-label">Student mobile</label> -->
	<input class="form-contorl" type="number" name="mobile" placeholder="Student Mobile" style="border-radius:6px;"/>
	</div>
	<div class="mb-2">
	<button class="btn btn-primary mb-3"  type="submit" >Register</button>
	<button class="btn btn-danger mb-3"  type="reset" >Cancel</button>
	</div>
</form>
</div>
</div>
</body>
</html>