package com.atguigu.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	/*	
		//String token=request.getParameter("token");
		//if("atguigu".equals(token)){
			//清除标记：没有方法清除固定的请求参数
		//}
	*/
		
		HttpSession session=request.getSession();
		
		
		Object token=session.getAttribute("token");
		
		String tokenValue = request.getParameter("token");
		System.out.println(token);
		System.out.println(tokenValue);
		
		if(token !=null && token.equals(tokenValue)){
			session.removeAttribute("token");
		}else{
			response.sendRedirect(request.getContextPath()+"/token/token.jsp");
			return;
		}
		
		    String name= request.getParameter("name");
			System.out.println("name: "+name);
			
			request.getRequestDispatcher(request.getContextPath()+"/token/success.jsp").forward(request, response);
	
	}

}