<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Results</title>
</head>
<body>
<div class="container">
<h3><caption>Available Flight Details</caption></h3>	
<table class="table table-striped">
	
		<tr>
			<th>Airline</th>
			<th>Dep City</th>
			<th>Arrival City</th>
			<th>Dep Time</th>
			<th>Select</th>
		</tr>
		<c:forEach var="b" items="${requestScope.result_flights}">
		
		<tr>
			<td>${b.airline}</td>
			<td>${b.depCity}</td>
			<td>${b.arrCity}</td>
			<td>${b.depTime}</td>
			<td><a href='<spring:url value="/passenger/passenger?bid=${b.flightId}"></spring:url>'>Select</a></td> 
			<%-- <td><a href='<spring:url value="/user/delete?bid=${b.acctId}"></spring:url>'>Delete Account</a></td> --%>
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>