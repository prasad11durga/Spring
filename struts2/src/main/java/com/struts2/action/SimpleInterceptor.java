package com.struts2.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SimpleInterceptor implements Interceptor {

	public void destroy() {
		System.out.println("Destroy ...");
		
	}

	public void init() {
		System.out.println("init ...");
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Pre processing ....");
		return invocation.invoke();
	}
	
	

}
