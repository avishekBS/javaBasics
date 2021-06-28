package com.servlet.learn.basics.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NotNullFilter
 */
//@WebFilter("/profileFill1")
public class NotNullFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		HttpServletRequest httpReq = (HttpServletRequest) request;
		Cookie[] cookies = httpReq.getCookies();
		if (httpReq.getRequestURI().contains("profileFill1")) {
			String marriedValue = httpReq.getParameter("married");
			if (marriedValue != null) {
				chain.doFilter(request, response);
			} else {
				request.getRequestDispatcher("ProfileFill1.html").include(request, response);
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("loginName")) {
						out.print("<p style=\"color:red;\">" + cookie.getValue() + " please select a value<b>");
					}
				}
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
