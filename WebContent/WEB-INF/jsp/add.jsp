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
	<form action="${pageContext.request.contextPath}/addEmp" method="post">
	<table border="0">
		<tr>
			<th colspan="2">Employee Input Page</th>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="lastname"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="emaim"></td>
		</tr>
		<tr>
			<td>Birth:</td>
			<td><input type="text" name="birth"></td>
		</tr>
		<tr>
		<tr>
			<td>Department:</td>
			<td>
				<select name="dept">
					<c:forEach items="${requestScope.depts}" var="dept">
						<option value="${dept.name}">${dept.name}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right" colspan="2"><input type="submit" value="添加"></td>
		</tr>
	</table>
	</form>
</body>
</html>