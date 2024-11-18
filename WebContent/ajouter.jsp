<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<h1>Ajouter un Etudiant</h1>
		<form action="PostAjouter" method="POST">
			<label> Nom </label> <input type="text" name="nom"> <label>Groupe
			</label> <select name="idgrp">
				<c:forEach items="${liste }" var="g">
					<option value="${g.id}">${g.titre }</option>
				</c:forEach>
			</select>
			<button type="submit">Ajouter</button>



		</form>
	</div>
</body>
</html>