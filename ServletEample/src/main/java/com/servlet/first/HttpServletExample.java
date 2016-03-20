package com.servlet.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpServletExample extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		
		//Getting http session to store the customer
		
		HttpSession session = req.getSession();
		session.setAttribute("customer", customer);
		
		//session.invalidate();
		
		
		Cookie cookie = new Cookie("cookie1" , "latha");
		cookie.setMaxAge(315569520);
		resp.addCookie(cookie);
		
		PrintWriter out = resp.getWriter();
		out.println("Welcome to HttpServlet example****");
		
	}

	
}
