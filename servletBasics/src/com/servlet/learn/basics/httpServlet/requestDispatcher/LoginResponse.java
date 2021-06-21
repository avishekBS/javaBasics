package com.servlet.learn.basics.httpServlet.requestDispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginResponse extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<p>User : <b>"+ req.getParameter("uName") + "</b> is logged at "+ req.getAttribute("date")+"</p>");
	}
}
