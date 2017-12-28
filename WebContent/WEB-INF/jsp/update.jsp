<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/jquery-1.7.2.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/updateEmp" method="post">
	<input type="hidden" name="id" value="${requestScope.employee.id}">
	<table border="0">
		<tr>
			<th colspan="2">Employee Update Page</th>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="lastname" value="${requestScope.employee.lastname}"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email" value="${requestScope.employee.email}"></td>
		</tr>
		<tr>
			<td>Birth:</td>
			<td><input type="text" name="birth" value="${requestScope.employee.birth}"></td>
		</tr>
		<tr>
			<td>Department:</td>
			<td>
				<select name="dept">
					<option value="${requestScope.employee.dept}" selected="selected">${requestScope.employee.dept}</option>
					<c:forEach items="${requestScope.depts}" var="dept">
						<c:if test="${dept.name != requestScope.employee.dept}">
							<option value="${dept.name}">${dept.name}</option>
						</c:if>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right" colspan="2"><input type="submit" value="修改"></td>
		</tr>
	</table>
	</form>
</body>
</html>