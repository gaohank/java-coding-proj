<%@page import="java.util.*,com.domain.*" contentType="text/html; charset=utf-8"%>
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
<%
	List<TEmp> list = (List<TEmp>)request.getAttribute("empList");
%>
<body>
	<form action="" method="post">
	<table border="1">
		<tr>
			<td>员工id</td>
			<td>员工姓名</td>
			<td>员工职位</td>
			<td>经理id</td>
			<td>出生日期</td>
			<td>薪水</td>
			<td>绩效</td>
			<td>部门id</td>
			<td>修改</td>
			<td>删除</td>
		</tr>
		<% 
		if(list!=null && list.size()!=0){
			for(int i=0;i<list.size();i++){
				TEmp emp = list.get(i);
				%>
				<tr>
					<td><%=emp.getEmpno() %></td>
					<td><%=emp.getEname() %></td>
					<td><%=emp.getJob() %></td>
					<td><%=emp.getMgr() %></td>
					<td><%=emp.getHiredate() %></td>
					<td><%=emp.getSal() %></td>
					<td><%=emp.getComm() %></td>
					<td><%=emp.getDeptno() %></td>
					<td><input type="button" value="修改" onclick="updateEmp('<%=emp.getEmpno()%>')"/></td>
					<td><input type="button" value="删除" onclick="delEmp(<%=emp.getEmpno()%>)"/></td>
				</tr>
				<%
			}
		}
		%>
	</table>
	</form>
</body>
<script type='text/javascript'> 
	function updateEmp(empno){
		alert("修改"+empno);
		document.forms[0].action="<%=path %>/bsr/updateInit.do?empno=" + empno;//这步不是修改，是在修改前按id查出待修改的记录
		document.forms[0].submit();
	}
	function delEmp(empno){
		alert("删除");
		document.forms[0].action="<%=path %>/bsr/deleteEmp.do?empno=" + empno;
		document.forms[0].submit();
	}
</script> 
</html>