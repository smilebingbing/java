<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h3>管理权限的页面</h3>
	
	<form action="AuthorityServlet?method=getAuthorities" method="post">
		Name: <input type="text" name="username"/>
		<input type="submit" value="Submit"/>
	</form>
	</center>
	
	<c:if test="${requestScope.user !=null }">
	<br><br>
		${requestScope.user.username }的权限是：
	<br><br>
	
	<form action="AuthorityServlet?method=updateAuthority" method="post">
		
		<input type="hidden" name="username" value="${requestScope.user.username }"/>
		
		<input type="checkbox" name="authority" value="Article-1"/>Article-1
		<br><br>
		
		<input type="checkbox" name="authority" value="Article-2"/>Article-2
		<br><br>
		
		<input type="checkbox" name="authority" value="Article-3"/>Article-3
		<br><br>
		
		<input type="checkbox" name="authority" value="Article-4"/>Article-4
		<br><br>
	
		<input type="submit" value="update"/>
	</form>
	</c:if>
</body>
</html>