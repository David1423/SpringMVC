<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<b>CountriesList.jsp</b>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
	<h2 style="color: red; text-align: center;">Date and Time ::
		${sysDate }</h2>
	<c:choose>
		<c:when test="${!empty countriesInfo}">
			<table border="2 red;">
				<tr>
					<th>Sr.No</th>
					<th>COUNTRY</th>
				</tr>
				<c:forEach varStatus="SrNo" var="country" items="${countriesInfo}">
					<tr>
						<td>${SrNo.count }</td>
						<td><b>${country }</b></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>

		<c:otherwise>
			<h1 style="color: red; text-align: center;">Data Could not be
				Fetched</h1>
		</c:otherwise>
	</c:choose>

	<b>Model Data :</b><br> "sysDate} :(checks data in all the
	scopes) ::" ${sysDate } <br> "requestScope.sysDate - checks in
	only reqeustScope]"${requestScope.sysDate } <br> " Expression tag
	based retrieving data using request.getAttribute('sysDate')::"
	<%=request.getAttribute("sysDate")%>
	
	<br> <a href="welcome">HOME</a>
</center>