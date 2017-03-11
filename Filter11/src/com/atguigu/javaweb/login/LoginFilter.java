package com.atguigu.javaweb.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.javaweb.HttpFilter;

public class LoginFilter extends HttpFilter{

	//1.从web.xml 中获取sessionKEY,redirectURL ,uncheckedURLs
	private String sessionKey;
	private String redirectUrl;
	private String uncheckedUrls;
	
    @Override
    protected void init() {
    	ServletContext servletContext=getFilterConfig().getServletContext();
    	
    	sessionKey=servletContext.getInitParameter("userSessionKey");
    	redirectUrl=servletContext.getInitParameter("redirectURL");
    	//
    	
    	uncheckedUrls=servletContext.getInitParameter("uncheckedUrls");
    	
    }

	
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		//1. 获取请求的ServletPath
		String ServletPath= request.getServletPath();
		
		// http://localhost:8080/Filter11/login/a.jsp
		//String requestUrl =request.getRequestURL().toString();
		// /Filter11/login/a.jsp
		//String requestURI =request.getRequestURI();
		// /login/a.jsp
		//String ServletPath=request.getServletPath();
		
		
		
		//2. 检查1获取的ServletPath 是否为不需要检查的URL中的一个，若是，则直接放行 ,方法结束
		List<String> urls =Arrays.asList(uncheckedUrls.split(","));
		if(urls.contains(ServletPath)){
			filterChain.doFilter(request, response);
			return;
		}
		//3. 从session 中获取sessionKey对应的值，若不存在，则重定向到redirectUrl
		Object user=request.getSession().getAttribute(sessionKey);
		if(user==null){
			response.sendRedirect(request.getContextPath()+redirectUrl);
			return;
		}
		//4. 若存在，则放行，允许访问
		filterChain.doFilter(request, response);
		
		
		
		
		
		
	}

}
