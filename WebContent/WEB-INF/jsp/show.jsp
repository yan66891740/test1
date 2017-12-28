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
<script type="text/javascript">
$(function(){
	$("a[name='del']").click(function(){
		var id = $(this).prve().prve().prve().prve().prve().prve();
		var stuName = $(this).prve().prve().prve().prve().prve();
		var tr = $(this).parent();
		if(confirm("确认删除"+stuName+"员工？")){
			$.ajax({
				url:"${pageContext.request.contextPath}/delEmp",
				type:"post",
				dataType:"text",	
				data:{id:id},
				success:function(data){
					if(data == 1){
						tr.remove();
					}else{
						alert("删除失败");
					}
				}
			})
		}
	})
	return false;
})
</script>
</head>
<body>
	<table border="5" cellpadding="10" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
			<th>BIRTH</th>
			<th>CREATETIME</th>
			<th>DEPT</th>
			<th>DELETE</th>
			<th>EDIT</th>
		</tr>
		<c:forEach items="${requestScope.employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.lastname}</td>
				<td>${employee.email}</td>
				<td>${employee.birth}</td>
				<td>${employee.createtime}</td>
				<td>${employee.dept}</td>
				<td><a name="del" href="#">Delete</a></td>
				<td><a href="${pageContext.request.contextPath}/queryEmp?id=${employee.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<form action="${pageContext.request.contextPath}/queryDept" method="get">
		<input type="submit" value="添加员工"/>
	</form>
</body>
</html>