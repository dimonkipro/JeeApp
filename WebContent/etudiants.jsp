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
		<h1>Liste des Etudiants</h1>
		<a class="btn btn-primary" href="PreAjouter">Ajouter un Etudiant</a> 
		<a class="btn btn-warning" href="Principale">Liste des Groupes</a>
		<div class="table">

			<table class="table table-hover">
				<tr>
					<th>Id</th>
					<th>Titre</th>
					<th>Groupe</th>
					<th>Action</th>
				</tr>

				<c:forEach items="${etds}" var="e">
					<tr>
						<td>${e.id }</td>
						<td>${e.nom }</td>
						<td>${e.gpe.titre }</td>
						<td><a class="btn btn-danger" href="Delete?id=${e.id }">Delete</a></td>


					</tr>
				</c:forEach>

			</table>

		</div>



	</div>
</body>
</html>