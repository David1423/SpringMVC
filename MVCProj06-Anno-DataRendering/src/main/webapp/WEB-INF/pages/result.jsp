<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b>Int data:: ${intData }</b><br>
    <b>String Data:: ${stringData }</b><br>
    <%-- <b>map Data:: ${mapData }</b><br> --%>
    
    <b>Integer Array Data:: 
    
    <c:forEach var="integer"  items="${integerArrayData }">
    	<b>${integer },</b>
	</c:forEach><br><br>
	
	<%-- map data --%>
 	<c:forEach var="map" items="${mapData }">
 		<b>${map.key } --->${ map.value}</b><br>
 	</c:forEach>   
 	
 	<%-- List of Student  Objects --%>
    	<c:choose >
    	<c:when test="${!empty student }">
    	<table border='1'>
    	<tr><th>S.NO</th><th>St. Name</th><th>St.Avg</th></tr>
    		<c:forEach var="st" items="${student }" >
    				<tr>
	    				<td>${st.getSno() }</td>
						<td>${st.getSname() }</td>
						<td>${st.getSavg() }</td>
					</tr>
    		</c:forEach>
    	</table>
    </c:when>
    <c:otherwise>
    	<h1 style="color:red;text-align:center">Data is not Fetched</h1>
    </c:otherwise>
</c:choose>

<b><a href="welcome">HOME</a></b>