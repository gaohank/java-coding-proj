<%@page contentType="text/html; charset=utf-8"%>
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
	<form action="" method="post"><!-- method="get" (浏览器：?username=)-->
		<input type="button" value="查询员工列表" onclick="empList()"/>
		<input type="button" value="新增员工" onclick="add()"/>
	</form>
</body>
<script type='text/javascript'>
	function empList(){
		alert("查询");//等价于System.out.println("查询");
		document.forms[0].action="<%=path %>/bsr/list.do";
		document.forms[0].submit();
	}
	function add(){
		alert("添加");
		document.forms[0].action="<%=path %>/bsr/addInit.do";
		document.forms[0].submit();
	}
</script>
</html>