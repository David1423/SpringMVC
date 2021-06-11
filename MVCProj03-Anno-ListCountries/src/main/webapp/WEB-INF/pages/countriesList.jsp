<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <h2>${sysDate }</h2>
    <c:choose>
    	<c:when test="${!empty countriesInfo}" >
    	
			<c:forEach var="country" items="${countriesInfo}">
							<li><b>${country }</b></li>
			</c:forEach>    		
    	</c:when>
    	
    	<c:otherwise>
    		<h1 style="color:red;text-align:center;">Data Could not be Fetched</h1>
    	</c:otherwise>
    </c:choose>
    <br>
    <a href="welcome">HOME</a>