package com.servlet.learn.basics.httpServlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("loginLink.html").include(req, resp);
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("loginName") && !cookie.getValue().equals("")) {
					 out.print("<b>Welcome to your profile "+ cookie.getValue().toUpperCase()+"<b>" );  
			         req.getRequestDispatcher("ProfileFill1.html").include(req, resp);
				}
				else {
					out.print("Please login first");  
		            req.getRequestDispatcher("CookieLogin.html").include(req, resp);
				}
			}
		}
		else {
			out.print("Please login first");  
            req.getRequestDispatcher("CookieLogin.html").include(req, resp);
		}
	}
}
