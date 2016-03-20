package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet implements Servlet {
	
	//Initialization
		public void init(ServletConfig arg0) throws ServletException {
			System.out.println("Init ...");
			
		} 
		
		//Destroying
		public void destroy() {
			System.out.println("Destroy ...");
			
		}

		public ServletConfig getServletConfig() {
			// TODO Auto-generated method stub
			return null;
		}

		public String getServletInfo() {
			return "SimpleServlet";
		}

		
	 //Request Processing
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
						
			PrintWriter writer = res.getWriter();
			writer.println("Second page....<br/>");
			writer.println("Please check your account details...."+username);
			
		}

}
