<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
	<h1>Result page</h1>
</center>
<c:choose>
	<c:when test="${empsInfo ne null && !empty empsInfo}">
		<table style="text-align:center;" border="1">
			<tr bgcolor="pink">
				<th>Sr. No</th>
				<th>EmpName</th>
				<th>Emp Address</th>
				<th>Desg</th>
				<th>Salary</th>
				<th>GrorssSalary</th>
				<th>NetSalary</th>
				<th>DeptNo</th>
			</tr>
			<c:forEach var="dto" items="${empsInfo}" varStatus="item">
				<tr >
					<td>${item.count }</td>
					<td>${dto.ename }</td>
					<td>${dto.eaddrs }</td>
					<td>${dto.edesg }</td>
					<td>${dto.esal }</td>
					<td>${dto.grossSalary }</td>
					<td>${dto.netSalary }</td>
					<td>${dto.edept }</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	
	<c:otherwise>
		<h1 style="color:red;">Records not Found</h1>
	</c:otherwise>

</c:choose>

<center><h2><a href="welcome">HOME</a></h2></center>