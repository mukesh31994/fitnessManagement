<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset="utf-8">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<style>
#tableDiv {
	width: 80%;
	padding: 20px;
	/* background-color: cornsilk; */
}

#bodyDiv {
	text-align: -webkit-center;
}

#bodyHeader {
	width: 80%;
	padding-bottom: 50px;
	padding-top: 50px;
	/* background-color: cornsilk; */
}

#employeeTable td {
	width: 20%;
}
</style>

</head>
<body>
	<div id="bodyDiv">
		<div id="bodyHeader">
			<h1>Employee Data</h1>
		</div>
		<div id="tableDiv">
			<table class="table table-hover table-fixed" id="employeeTable">
				<thead>
					<tr>
						<th>Employee Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Salary (€)</th>
						<th>Position</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="results" items="${employeeList}">
						<tr>
							<td><c:out value="${results.empId}"></c:out></td>
							<td><c:out value="${results.firstName}"></c:out></td>
							<td><c:out value="${results.lastName}"></c:out></td>
							<td><c:out value="${results.salary}"></c:out></td>
							<td><c:out value="${results.position}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>


			</table>

		</div>
	</div>
</body>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</html>
