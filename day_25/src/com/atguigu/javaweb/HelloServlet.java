package com.atguigu.javaweb;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.omg.CORBA.portable.InputStream;

public class HelloServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init");
		
		String user=servletConfig.getInitParameter("user");
		System.out.println("user:"+user);
		
		Enumeration<String> names=servletConfig.getInitParameterNames();
		while(names.hasMoreElements()){
			String name=names.nextElement(); 
			String value=servletConfig.getInitParameter(name);
			System.out.println("^^"+name+":"+name);
		}
		
		String servletName =servletConfig.getServletName();
		System.out.println(servletName);
		
		//获取ServletContext对象
		ServletContext servletContext =servletConfig.getServletContext();
		
		String driver=servletContext.getInitParameter("driver");
		System.out.println("driver"+driver);
	
	    Enumeration<String> names2=servletConfig.getInitParameterNames();
	    while(names2.hasMoreElements()){
	    	String name=names2.nextElement();
	    	System.out.println("-->"+name);
	    }
	    
	    String realPath=servletContext.getRealPath("/note.txt");
	    System.out.println(realPath);
	    
	    String contextPath=servletContext.getContextPath();
	    System.out.println(contextPath);
	
	    try{
	    	ClassLoader classLoader=getClass().getClassLoader();
	        InputStream is=(InputStream) classLoader.getResourceAsStream("jdbc.properties");
	        System.out.println("1. "+is);
	    
	    
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	    try{
	    	InputStream is2=(InputStream)servletContext.getResourceAsStream("jdbc.properties");
	    	System.out.println("2. "+is2);
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
	}
	
	public HelloServlet(){
		System.out.println("HelloServlet's constructor");
	}

}