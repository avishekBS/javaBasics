package com.servlet.learn.basics.httpServlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieLoginExample extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("loginLink.html").include(req, resp);
		String name = req.getParameter("name");
		String pwd = req.getParameter("password");
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getValue().equals("")) {
					if (name.equalsIgnoreCase("avishek") && pwd.equals("Password")) {
						/*Cookie new_cookie = new Cookie("loginName", name);
						resp.addCookie(new_cookie);*/
						cookie.setValue(name);
						out.print("You are successfully logged in!");  
			            out.print("<br>Welcome, "+name);  
					}
					else if (name == "" || pwd == "") {
						out.print("<p style=\"color:red;\">Username or password is empty <b>"+ name +"</b></p>");
						req.getRequestDispatcher("CookieLogin.html").include(req, resp);
					}
					else {
						out.print("<p style=\"color:red;\">Login failed for <b>"+ name +"</b></p>");
						req.getRequestDispatcher("CookieLogin.html").include(req, resp);
					}
				}
				else {
					out.print("<p style=\"color:red;\">You are already logged in<b>"+ cookie.getValue() +"</b></p>");
					req.getRequestDispatcher("CookieLogin.html").include(req, resp);
				}
			}
		}
		else {
			if (name.equalsIgnoreCase("avishek") && pwd.equals("Password")) {
				Cookie cookie = new Cookie("loginName", name);
				resp.addCookie(cookie);
				cookie.setValue(name);
				out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name); 
			}
			else if (name == "" || pwd == "") {
				out.print("<p style=\"color:red;\">Username or password is empty <b>"+ name +"</b></p>");
				req.getRequestDispatcher("CookieLogin.html").include(req, resp);
			}
			else {
				out.print("<p style=\"color:red;\">Login failed for <b>"+ name +"</b></p>");
				req.getRequestDispatcher("CookieLogin.html").include(req, resp);
			}
		}
	}
}
