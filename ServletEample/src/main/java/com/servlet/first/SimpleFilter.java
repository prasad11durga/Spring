package com.servlet.first;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Init....");
		
	}

	//dofilter
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filter Preprocesing ....");
		
		chain.doFilter(request, response);
		
		System.out.println("Filter Postprocesing ....");
	}

	public void destroy() {
		System.out.println("Destroy....");
		
	}

	
}
