<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>

                               <!-- Using Bootstrap for styling and Spring MVC supplied Form tags for data Binding  -->

<center>
<div class="container">

<div class=" fs-2 text-center text-danger">Registration Form for Students</div>
<div class="col=md-3" >

<form:form method="post"  class=" shadow-lg form-md bg-info"  align="center" modelAttribute="stud">
<caption>Student Registration Form</caption>
	<div class="mb-2">
	<form:input path="sname" class="form-contorl"  type="text"   id="sname" placeholder="Student Name"  style="border-radius: 6px;"/>
	</div>
	<div class="mb-2">
	<form:input path="sadd" class="form-contorl"  type="text"  placeholder="Student Address" style="border-radius:6px;"/>
	</div>
	
	<div class="mb-2">
	<form:input path="savg" class="form-contorl"  type="text" placeholder="Student Class" style="border-radius:6px;"/>
	</div>
	
	<div class="mb-2">
	<form:input path="mobile" class="form-contorl"  type="number"  placeholder="Student Mobile" style="border-radius:6px;"/>
	</div>
	
	<form:button type="submit" value="Register" class="btn btn-primary mb-3" >Register</form:button>
	<form:button type="reset" value="cancel" class="btn btn-danger mb-3" >Cancel</form:button>
</form:form>
</div>
</div>
</center>