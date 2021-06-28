package com.servlet.learn.basics.httpServlet.hiddenForm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileFill2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String married = request.getParameter("married");
		String petName = request.getParameter("petName");
		
		if (!"".equals(petName)) {
			Boolean isMarried = Boolean.parseBoolean(married);
			if (isMarried) {
				out.print("<p> you are married");
			}
			else {
				out.print("<p> you are not married");
			}
			out.print(" & your pet name is "+petName + "</p>");
		}
		else {
			request.getRequestDispatcher("profileFill1").include(request, response);
			out.print("<p style=\"color:red;\"> Please fill data<b>");
		}
	}
}
