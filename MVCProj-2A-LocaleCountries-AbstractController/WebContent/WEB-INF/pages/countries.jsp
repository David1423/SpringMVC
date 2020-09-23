<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>
	<h1 style="color:red;">List of All Countries Available</h1>
	<table style="background: gray; border-color: blue; color: white;"
		title="Countires List" border="1">
		<tr>
			<th>S.NO</th>
			<th>Country</th>
		</tr>

		<c:forEach var="country" items="${countries}" varStatus="count">
			<tr>
				<td>${count.count}</td>
				<td><c:out value="${country}" /></td>
			</tr>
		</c:forEach>
	</table>
	<h2>
		<a href="welcome.htm">HOME</a>
	</h2>
</center>