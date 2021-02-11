<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Status</title>
</head>
<body>
<div class="container">
<h1><span class="badge badge-secondary">Reservation Summary</span></h1>
<table class="table table-striped">
	
		<tr>
			<th>Reservation Number</th>
			<td>ABCD9918${requestScope.reservation.reservationNumber}</td>
		</tr>
		<tr>
			<th>Passenger Name</th>
			<td>${requestScope.reservation.passName}</td>
		</tr>
		<tr>
			<th>Passenger Email</th>
			<td>${requestScope.reservation.passEmail}</td>
		</tr>
		<tr>
			<th>Passenger Contact Number</th>
			<td>${requestScope.reservation.passNumber}</td>
		</tr>
		<tr>
			<th>Airline</th>
			<td>${requestScope.reservation.flightName}</td>
		</tr>
		<tr>
			<th>Dep City</th>
			<td>${requestScope.reservation.depCity}</td>
		</tr>
		<tr>
			<th>Arrival City</th>
			<td>${requestScope.reservation.arrCity}</td>
		</tr>	
		<tr>
			<th>Departure Date</th>
			<td>${requestScope.reservation.depDate}</td>
		</tr>
		<tr>
			<th>Departure Time</th>
			<td>${requestScope.reservation.depTime}</td>
		</tr>
		<tr>
			<th>Arrival Date</th>
			<td>${requestScope.reservation.arrDate}</td>
		</tr>
		<tr>
			<th>Arrival Time</th>
			<td>${requestScope.reservation.arrTime}</td>
		</tr>
	</table>
	
	
	<button onclick="window.print()" style="margin-left: 400px">Print this page</button>
	<h4 style="color: grey; text-decoration:inherit;">User has been logged off,<a href='<spring:url value="/user/login"></spring:url>'>click here</a> to login again</h4>
	</div>
</body>
</html>