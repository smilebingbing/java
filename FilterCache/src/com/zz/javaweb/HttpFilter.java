package com.zz.javaweb;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpFilter implements Filter {

	private ServletConfig servletConfig;
	
	public void init(FilterConfig arg0)throws ServletException{
		this.servletConfig=servletConfig;
		init();
	}
	
	public void destroy(){
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		doFilter(request, response, chain);
		
	}
	
	public abstract void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain)
			throws IOException, ServletException;
	
	protected void init(){
		
	}
	
	public ServletConfig getServletConfig() {
		return servletConfig;
	}
	
	
		
	
}
