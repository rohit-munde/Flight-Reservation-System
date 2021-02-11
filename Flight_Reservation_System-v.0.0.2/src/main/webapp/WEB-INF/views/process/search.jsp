<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>
</head>
<body>

<h5 style="margin-left: 40px; margin-top: 30px">Hi, ${sessionScope.valid_user.name}</h5>
<%-- <h3>User Details: ${sessionScope.valid_user}</h3> --%>
<h1 style="margin-left: 40px">Check here for availability for your Journey!</h1>
<div class="container">
<form  method="post" >
<div class="form-group">
		<table class="table">
			<tr>
				<td>From</td>
				<td><input type="text" name="from" /></td>
			</tr>
			<tr>
				<td>To</td>
				<td><input type="text" name="to" /></td>
			</tr>
			<tr>
				<td>Departure Date</td>
				<td><input type="date" name="depdate" /></td>
			</tr>

			<tr>
			<td></td>
				<td><input type="submit" value="Search Flights" class="btn btn-info"/></td>
			</tr>
		</table>
		</div>
	</form>
</div>

<div class="container">
<h1 style="margin-left: 40px"><span class="badge badge-danger">${requestScope.flight_na}</span></h2>
</div>
</body>
</html>