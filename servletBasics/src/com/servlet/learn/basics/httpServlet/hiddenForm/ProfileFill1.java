package com.servlet.learn.basics.httpServlet.hiddenForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileFill1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("loginLink.html").include(request, response);
		String marriedValue = request.getParameter("married");
		Cookie[] cookies = request.getCookies();
		
		if(marriedValue != null) {
			Boolean isMarried = Boolean.parseBoolean(marriedValue);
			out.print("<form action='profileFill2'>");  
	        out.print("<input type='hidden' required='required' name='married' value='"+isMarried+"'>");  
	        out.print("Your Pet Name:<input type='text' name='petName'>");  
	        out.print("<input type='submit' value='submit'>");  
	        out.print("</form>");  
		}
	}

}
