package com.servlet.learn.basics.httpServlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieLogoutExample extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		request.getRequestDispatcher("CookieLogin.html").include(request, response);
		if (cookies !=null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("loginName") && !cookie.getValue().equals("")) {
					out.print(cookie.getValue()+" successfully logged out!");
				}
				else {
					out.print("Please Login!");
				}
			}
			Cookie cookie = new Cookie("loginName", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		else{
			out.print("login First!");
		}
	}

}
