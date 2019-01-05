<%@page contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-2.1.3.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="post"><!-- method="get" (浏览器：?username=)-->
		<input type="button" value="查询员工列表" onclick="empList()"/>
		<input type="button" value="新增员工" onclick="add()"/>
		<input type="button" value="测试ajax" onclick="ajax(<%=path %>)"/>
		<input type="text" id="name" name="name"/><!-- id给前台，name给后台 -->			<span id="uname"></span><span id="result"></span>
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
	
	function ajax1(path){  
        $.ajax({  
        	data:"name="+$("#name").val(),
            type:"GET",  
            dataType: 'text',  
            url:path+"/bsr/test.do",  
            error:function(data){  
                alert("出错了！！:"+data.msg);  
            },  
            success:function(data){  
                alert("success:"+data.msg);  
                $("#result").html(data.msg) ;  
            }  
        });  
    } 
	
	
	function ajax(){               
		var xhr = null;
        //确保IE7,IE8，FireFox下可以运行
        if(window.XMLHttpRequest){
            xhr = new XMLHttpRequest();
        }else{
            //确保IE6可以运行，无视更古老的IE浏览器
            xhr = new ActiveXObject("Microsoft.XMLHttp");
        }         
        
        xhr.onreadystatechange=function(){
            if(xhr.readyState==4 && xhr.status==200){
                document.getElementById("name").innerHTML = xhr.responseText;
            }else{
            	alert("fail:" + xhr.readyState);
            }
        };
       /*  xhr.setRequestHeader('content-type',
                'application/x-www-form-urlencoded'); */
		xhr.open("post","<%=path %>/bsr/test.do?name=ddd",true);
        document.getElementById("uname").innerHTML="正在检查。。。";
        var name = document.getElementById("name");
            xhr.send("name="+name.value);
    }   
</script> 
</html>