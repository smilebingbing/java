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
	<h4>c:url 产生一个url地址。可以Cookie是否可用来智能进行URL重写对GET请求的参数进行编码</h4>
	<c:url value="/test.jsp" var="testurl">
		<c:param name="name" value="atguigu"></c:param> 
	url:${testurl }
	</c:url>

	<h4>c:redirect 使当前JSP页面重定向到指定页面,使当前jsp页面转发到指定页面可以使用</h4>
	<c:redirect url="http://www.baidu.com"></c:redirect>
    / 代表的是当前web应用的根目录
    response.sendRedirect("/") /代表WEB站点的根目录

		<h4>c:import 可以包含任何页面到当前页面</h4>
		<c:import url="http://www.baidu.com"></c:import>




	<c:forEach begin="1" end="10" step="2" var="i">
		${ i}--
	</c:forEach>
		
		
		<br><br>

	<c:choose>
		<c:when test="${param.age>60 }">老年</c:when>
		<c:when test="${param.age>40 }">中年</c:when>
		<c:when test="${param.age>18 }">青年</c:when>
		<c:otherwise>未成年</c:otherwise>
	</c:choose>


	<h3>c:if</h3>
	<c:set value="20" var="age" scope="request"></c:set>
	
	<c:if test="${requestScope.age>18 }">成年了</c:if>
	
	
	<h3>c:set</h3>
	
	<c:set var="name" value="atguigu" scope="page"></c:set>
	<%--
		pageContext.setAttribute("name","atguigu");
	 --%>
	 name: ${pageScope.name }
	 <br><br>
	 <br><br>
	 
	 <c:set var="subject" value="${param.subject }" scope="session"></c:set>
		 subject: ${sessionScope.subject }
	<br><br>
	<br><br>
	
	<c:set value="1992-9-1" var="date" scope="session"></c:set>
	date: ${sessionScope.date }
	<br><br>
	<c:remove var="date" scope="session"/>
	date: --${sessionScope.date }--



	<h4>c:out</h4>
	
	<%
		request.setAttribute("book","<<Java>>");
	%>
		book: ${requestScope.book }
	<br><br>
		book: <c:out value="${requestScope.book }"></c:out>
</body>
</html>