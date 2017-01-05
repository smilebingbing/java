package com.atguigu.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet extends GenericServlet {


	//对当前的Servlet 进行初始化: 覆盖init方法
	@Override
	public void init() throws ServletException{
		System.out.println("初始化...");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//获取请求方式是GET 还是 POST
		HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		String method = httpServletRequest.getMethod();
		System.out.println(method);
		
		
		
		//1. 获取请求参数：username,password
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		//2. 获取当前WEB应用的初始化参数 :user,password
		//需要使用ServletContext 对象
		ServletContext servletContext = getServletConfig().getServletContext();
		String initUser=getServletContext().getInitParameter("user");
		String initPassword=getServletContext().getInitParameter("password");

		PrintWriter out=response.getWriter();
		
		
		
		//3. 比对
		//4. 打印响应字符串
		if(initUser.equals(username) && initPassword.equals(password)){
			out.print("Hello: "+username);
		}else{
			out.println("sorry: "+username);
		}
		
		
	
	}


}
