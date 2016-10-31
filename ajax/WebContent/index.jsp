<%@ page language="java" contentType="text/html; charset="gbk"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

window.onload=function(){
	//1.获取a节点，并为其添加onclick响应函数
	document.getElementsByTagName("a")[0].onclick=function(){
		
		//3.创建一个XMLHttpRequest对象
		var request=new XMLHttpRequest();
		
		//4.准备发送请求的数据:url
		var url=this.href;
		var method="GET";
		
		//5.调用XMLHttpRequest对象的open方法
		request.open(method,url);
		
		//6.调用XMLHttpRequest对象的send方法
		request.send(null);
		
		//7.为XMLHttpRequest对象添加onreadystatechange响应函数
		request.onreadystatechange=function(){
			if(request.readyState==4){
				if(request.status==200||request.status==304){
					alert(request.responseText);
				}
			}
		}
		//8.判断响应是否完成：XMLHttpRequest对象的readyState属性值为4的时候
		
		//9.再判断响应是否可用：XMLHttpRequest对象status属性值为200
		
		//10.打印响应函数：responseText
		//2.取消a节点的默认行为
		return false;
	}
}

</script>
</head>
<body>
 <a href="ajaxhello.txt">helloAjax</a>
</body>
</html>