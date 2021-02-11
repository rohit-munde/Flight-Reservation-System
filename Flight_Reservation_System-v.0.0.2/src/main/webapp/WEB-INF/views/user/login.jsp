<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

<%-- /user/login method=post--%>
 <div class="container">
<form method="post">
        <fieldset>
            <legend>Login Window</legend>
            <table class="table table-striped table-dark">
           
			<tr>
				<td>Email: </td>
				<td><input type="text" name="email" size="60" /></td>
			</tr>
			<tr>
				<td>Password: </td>
				<td><input type="password" name="password" size="60"/></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Login" class="btn btn-primary"/></td>
			</tr>
            </table>
        </fieldset>
    </form>
    <h5 style="color: red;">${requestScope.mesg}</h5>
    </div>
</body>
</html>