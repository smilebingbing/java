package com.atguigu.javaweb;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义的HttpFilter, 实现自Filter接口
 * @author Bing
 *
 */
public abstract class HttpFilter implements Filter {
	
	private FilterConfig filterConfig;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	} 

	/**
	 * 原生的doFilter 方法，在方法内部把ServletRequest,ServletResponse 转为HttpServletRequest，并调用了doFilter()方法
	 * 若编写过滤器的过滤方法，不建议直接继承该方法，
	 * 而建议继承doFilter(HttpServletRequest request ,HttpServletResponse response,FilterChain filterChain)方法
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		doFilter(request,response,chain);
		
	}
	
/**
 * 抽象方法，为Http请求定制
 * @param request
 * @param response
 * @param filterChain
 * @throws IOException
 * @throws ServletException
 */
	public abstract void doFilter(HttpServletRequest request ,HttpServletResponse response,FilterChain filterChain)
			throws IOException,ServletException;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

		this.filterConfig=filterConfig;
		init();
	}

	protected void init() {
		// TODO Auto-generated method stub
		
	}
	public FilterConfig getFilterConfig() {
		return filterConfig;
	}

}
