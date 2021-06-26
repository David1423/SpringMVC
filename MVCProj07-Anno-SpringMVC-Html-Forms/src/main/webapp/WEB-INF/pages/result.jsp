<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<center>
    <h1>${result }</h1><br>
    <h2>Student Details</h2><br>
    <%-- <c:if test="${!empty stud }">
    	Student Name :: ${details.getSname() }<br>
    	Student Address :: ${details.getSadd() }<br>
    	Student Class :: ${details.getSclass() }<br>
    	Student Mobile :: ${details.getMobile() }<br>
    </c:if>  --%>
    <h3>${stud }</h3>
</center>
    