<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Passenger</title>
</head>
<body>
<div class="container">
<h3><caption>Available Flight Details</caption></h3>
<table class="table table-striped">
		
		<tr>
			<td>Airline :</td>
			<td>${requestScope.chosen_flight.airline}</td>
		</tr>
		<tr>
			<td>Dep City</td>
			<td>${requestScope.chosen_flight.depCity}</td>
		</tr>
		<tr>
			<td>Arrival City</td>
			<td>${requestScope.chosen_flight.arrCity}</td>
		</tr>
		<tr>	
			<td>Dep Time</td>
			<td>${requestScope.chosen_flight.depTime}</td>
		</tr>
	</table>
	<h2>Enter Passenger Details</h2>
	
	<form:form method="post" modelAttribute="passenger">
			<table>
				<tr>
					<td>Flight ID : </td>
					 <td><form:input type="text" path="bookedFlight.flightId" disabled="true"/></td>
				</tr>
				<tr>
					<td>Passenger Name: </td>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<td>Email: </td>
					<td><input type="text" name="email" required="required"></td>
				</tr>
				<tr>
					<td>Phone Number: </td>
					<td><input type="text" name="phoneNumber" required="required"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Enter Details"></td>
					<td></td>
				</tr>
			</table>
	</form:form>
	</div>
</body>
</html>