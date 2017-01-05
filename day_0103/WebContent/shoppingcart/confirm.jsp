<%@page import="com.atguigu.javaweb.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<%
		Customer customer =(Customer)session.getAttribute("customer");
		String [] books =(String [])session.getAttribute("books");
	%>
	
	<h4>Step-3: 订单确认</h4>
	
	<form action="" method="post">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>顾客姓名</td>
				<td><%=customer.getName() %></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><%=customer.getAddress() %></td>
			</tr>
			<tr>
				<td colspan="2">付款信息</td>
			</tr>
			<tr>
				<td>信用卡类型</td>
				<td><%=customer.getCardType() %></td>
			</tr>
			<tr>
				<td>卡号</td>
				<td><%=customer.getCard() %></td>
			</tr>
			<tr>
				<td >订货项目</td>
				<td>
					<%
						for(String book:books){
							out.print(book);
							out.print("<br>");
						}
					%>
				</td>
			</tr>
		
		
		
		</table>
	</form>

</body>
</html>