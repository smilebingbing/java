package com.atguigu.javaweb;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloFilter implements Filter {


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy..");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("Before HelloFilter's doFilter's chain.doFilter...");
		chain.doFilter(request, response);
		
		System.out.println("After HelloFilter's doFilter's chain.doFilter...");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

		System.out.println("init..");
	}

}
