<%@page import="java.util.*,com.domain.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!-- 导入jstl标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=path %>/bsr/addEmp.do" method="post">
		<table border="1">
			<tr><td>员工id<input name="empno" value="${emp.empno}"/></td></tr>
			<tr><td>员工姓名<input name="ename" value="${emp.ename}"/></td></tr>
			
			<tr><td>员工职位<input name="job" value="${emp.job}"/></td></tr>
			<tr><td>经理id<input name="mgr" value="${emp.mgr}"/></td></tr>
			<!-- <tr><td>出生日期<input name="hiredate" value="${emp.hiredate}"/></td></tr> -->
			<tr><td>出生日期<input  id="" name="hiredate" value="<fmt:formatDate value='${emp.hiredate }' type='date' pattern='yyyy-MM-dd'/>" ></td></tr>
			<tr><td>薪水<input name="sal" value="${emp.sal}"/></td></tr>
			<tr><td>绩效<input name="comm" value="${emp.comm}"/></td></tr>
			<tr><td>部门id<input name="deptno" value="${emp.deptno}"/></td></tr>
		</table>
		
		<c:choose>
			<c:when test="${not empty emp}">
				<input type="button" value="updateEmp" onclick="updateEmp()"/>
			</c:when>
        	<c:otherwise>
				<input type="submit" value="新增员工"/>
			</c:otherwise>
		</c:choose>
	</form>
</body>
<script type='text/javascript'> 
	function updateEmp(){
		alert("修改");
		document.forms[0].action="<%=path %>/bsr/updateEmp.do";
		document.forms[0].submit();
	}
</script> 
</html>