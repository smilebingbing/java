<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>Hello Page</h4>
	
	学习Java!
	
	<br><br>
	
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	
	username: <%=request.getParameter("username") %>

	<br><br>
	<%
	 	String val =request.getParameter("username");
		String username =new String(val.getBytes("iso-8859-1"),"UTF-8");
		out.print(username);
	
	%>
</body>
</html>