package com.atguigu.javaweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义的一个Servlet接口的实现类 :让开发的任何Servlet 都继承该类，以简化开发 
 * @author Bing
 *
 */
public abstract class MyGenericServlet implements Servlet, ServletConfig {

	/** 以下方法为Servlet 接口的方法**/
	@Override
	public void destroy() {}

	@Override
	public ServletConfig getServletConfig() {

		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	private ServletConfig servletConfig;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.servletConfig=arg0;
		init();

		
	}
	public void init() throws ServletException{
		
	}

	@Override
	public abstract void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException ;

	/**
	 * 以下方法为ServletConfig接口的方法
	 */
	
	@Override
	public String getInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameter(arg0);
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameterNames();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return servletConfig.getServletContext();
	}

	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return servletConfig.getServletName();
	}
	

	

}
