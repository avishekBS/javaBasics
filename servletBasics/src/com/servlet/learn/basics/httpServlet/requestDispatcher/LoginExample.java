package com.servlet.learn.basics.httpServlet.requestDispatcher;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginExample extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName = req.getParameter("uName");
		String pwd = req.getParameter("pwd");
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    String stringDate = formatter.format(date);
	    
	    req.setAttribute("date", stringDate);
		if (pwd.equals("PassWord")) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/dispatchResponse");
			dispatcher.forward(req, resp);
		}
		else {
			resp.getWriter().print("<p style=\"color:red;\">Login failed for <b>"+ uName +"</b> at "+ stringDate + "</p>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/index.html");
			dispatcher.include(req, resp);
		}
	}
}
