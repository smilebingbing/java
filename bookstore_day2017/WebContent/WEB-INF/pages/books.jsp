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
	
		<br><br>
		<form action="bookServlet?method=getBooks" method="post">
			Price:<input type="text"size="1" name="minPrice"/>-
			      <input type="text" size="1" name="maxPrice"/>
			      
			      <input type="submit" value="Submit"/>
		</form>
	
		<br><br>
		<table>
			
			<c:forEach items="${bookpage.list }" var="book">
				<tr>
					<td>
						<a href="">${book.title }</a>
					</td>
				</tr>
			
			</c:forEach>
			
		</table>
	</center>


</body>
</html>