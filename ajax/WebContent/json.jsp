<%@ page language="java" contentType="text/html; charset="UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.7.2.js"></script>

<script type="text/javascript">

	$(function(){
		$("a").click(function(){
			//使用load方法处理ajax
			var url=this.href;
			$("#content").load();
			
			return false;
		})
	});
</script>
</head>
<body>
    
    <a href="ajaxhello.txt">HelloAjax</a>
    <div id="content"></div>
</body>
</html>