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
				<c:forEach var="person" items="${tinyPerson}">
				<tr>
				
					<td>${person.name}</td>
					<td>${person.invented}</td>
					<td>${person.year}</td>
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
    <form method="get" action="/complete">
    <button type="submit">See the complete list</button>
</form>

</body>
</html>