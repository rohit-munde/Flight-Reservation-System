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
<title>payment Redirect</title>
</head>
<body>
<br>
<form method="post">
<div class="container">
  <h5>Card Details <span class="badge badge-secondary">verify</span></h5>
  <div class="w-50">
    <label>Card Number</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" placeholder="Enter Card Number" required>
  </div>
  <div class="w-50">
    <label>Name</label>
    <input type="text" class="form-control" placeholder="Name" required>
  </div>
  <div class="w-50">
   <label>Exp Date</label>
	<input type="date" class="form-control" required>
  </div>
  <div class="w-50">
  	<label>CVV</label>
	<input type="number" class="form-control" placeholder="CVV" required>
 <br>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</div>
</form>
</body>
</html>