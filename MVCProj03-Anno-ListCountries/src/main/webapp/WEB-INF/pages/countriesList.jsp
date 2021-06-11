<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <h2>${sysDate }</h2>
    <c:choose>
    	<c:when test="${!empty countriesInfo}" >
    	<table border="1 red;">
    	<tr><th>SR.No</th><th>COUNTRY</th></tr>
			<c:forEach varStatus="SrNo"  var="country" items="${countriesInfo}">
							<tr><td>${SrNo.count }</td>
							<td><b>${country }</b></td></tr>
			</c:forEach>
			</table>
    	</c:when>
    	
    	<c:otherwise>
    		<h1 style="color:red;text-align:center;">Data Could not be Fetched</h1>
    	</c:otherwise>
    </c:choose>
    <br>
    <a href="welcome">HOME</a>