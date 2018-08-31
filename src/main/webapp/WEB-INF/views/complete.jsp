<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Famous People</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/darkly/bootstrap.min.css">

<body>
<main class="container">
<p></p>
<table class="table">
			<thead>
				<tr>
					<th>Famous Person</th><th>Innovation</th><th>Year</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="person" items="${ completePerson }">
				<tr>
				
					<td>${person.firstName} ${ person.lastName }</td>
					<td>${person.innovation}</td>
					<td>${person.year}</td>
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
<form method="get" action="/">
    <button type="submit">See the tiny list</button>
</form>

</body>
</html>