<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>AAA Page</h3> 
	
	<!-- 在a.jsp中包含b.jsp -->
	<%-- 
	<%@ include file="b.jsp" %>
	<jsp:include page="b.jsp"></jsp:include>
	
	--%>
	
	<jsp:forward page="/include/b.jsp">
		<jsp:param value="abcd" name="username"/>
	</jsp:forward>
	
	<%--
		request.getRequestDispatcher("/include/b.jsp").forward(request, response);
	
	--%>	
</body>
</html>