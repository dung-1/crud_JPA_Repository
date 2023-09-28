<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP + MySQL
				Example - Customer Management</h3>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add SinhVien</div>
				</div>
				<div class="panel-body">
					<form:form action="saveStudent" cssClass="form-horizontal" method="post" modelAttribute="students">
						<div class="form-group">
							<label for="hoTen" class="col-md-3 control-label">Họ Tên </label>
							<div class="col-md-9">
								<form:input path="hoTen" cssClass="form-control" required="required" maxlength="250" />
								<form:errors path="hoTen" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="cccd" class="col-md-3 control-label">CCCD</label>
							<div class="col-md-9">
								<form:input path="cccd" cssClass="form-control" maxlength="250" />
								<form:errors path="cccd" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="diachihientai" class="col-md-3 control-label">Địa Chỉ Hiện Tại</label>
							<div class="col-md-9">
								<form:input path="diaChi" cssClass="form-control" maxlength="250" />
								<form:errors path="diaChi" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="gioitinh" class="col-md-3 control-label">Giới Tính</label>
							<div class="col-md-9">
								<form:input path="gioiTinh" cssClass="form-control" maxlength="250" />
								<form:errors path="gioiTinh" cssClass="error" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="ngaySinh" class="col-md-3 control-label">Ngày Sinh</label>
							<div class="col-md-9">
								<form:input path="ngaySinh" type="date" cssClass="form-control" />
								<form:errors path="ngaySinh" cssClass="error" />
							</div>
						</div>
						<div class="form-group"><label for="quequan" class="col-md-3 control-label">Quê Quán</label>
							<div class="col-md-9">
								<form:input path="queQuan" cssClass="form-control" maxlength="250" />
								<form:errors path="queQuan" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="province" class="col-md-3 control-label">Khóa Học</label>
							<div class="col-md-9">
								<form:select path = "cours" cssClass="form-control">
				                     <form:option value = "" label = "Select"/>
				                     <c:forEach var="provin" items="${cours}">
      									<form:option value="${provin.id }" label="${provin.name}" 
      									selected="${provin.id==student.cours.id?'selected':''}"
      									/>
   									 </c:forEach>
   
				                  </form:select> 
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
						