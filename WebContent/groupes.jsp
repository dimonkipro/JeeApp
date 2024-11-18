<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap-5/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>Liste des Groupes</h1>
		<div class="table">

			<table class="table table-hover">
				<tr>
					<th>Id</th>
					<th>Titre</th>
					<th>Action</th>
				</tr>

				<c:forEach items="${grps}" var="g">
					<tr>
						<td>${g.id }</td>
						<td>${g.titre }</td>
						<td><a class="btn btn-success" href="PreEtds?id=${g.id }">Liste des Etudiants</a></td>


					</tr>
				</c:forEach>

			</table>
		</div>



	</div>

</body>
</html>