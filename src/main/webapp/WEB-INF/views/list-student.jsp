<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>javaguides.net</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<%@ page isELIgnored="false"%>
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP +
				MySQL Example - Customer Management</h3>
			<hr />

			<input type="button" value="Add Customer"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Customer List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Họ Tên</th>
							<th>Ngày sinh</th>
							<th>Địa chỉ hiện tại</th>
							<th>CCCD</th>
							<th>Giới tính</th>
							<th>Quê Quán</th>
							<th>Khóa học</th>
							<th>Action</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempCustomer" items="${student}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/student/updateForm">
								<c:param name="studentId" value="${tempCustomer.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/student/delete">
								<c:param name="studentId" value="${tempCustomer.id}" />
							</c:url>

							<tr>
								<td>${tempCustomer.hoTen}</td>
								<td>${tempCustomer.ngaySinh}</td>
								<td>${tempCustomer.diaChi}</td>
								<td>${tempCustomer.cccd}</td>
								<td>${tempCustomer.gioiTinh}</td>
								<td>${tempCustomer.queQuan}</td>
								<td>${tempCustomer.cours.name}</td>


								<!-- display the update link -->
								<a href="${updateLink}">Update</a> |
								<a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>
	<div class="footer">
		<p>Footer</p>
	</div>
</body>

</html>








