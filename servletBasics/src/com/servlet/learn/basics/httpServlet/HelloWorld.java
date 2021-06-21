package com.servlet.learn.basics.httpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloWorld
 */
public class HelloWorld extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		out.println("<h4>Welcome " + name + " to your first servlet page</h4>");
		
		/*
		 * Servlet Config --> init-param 
		 */
		out.println("<h4>Servlet Config for your first servlet page</h4>");
		ServletConfig servletConfig = getServletConfig();
		Enumeration<String> initParamNames = servletConfig.getInitParameterNames();
		while (initParamNames.hasMoreElements()) {
			String string = (String) initParamNames.nextElement();
			out.print("Init param Names : param value = " + string + " : " + servletConfig.getInitParameter(string)+"<br>");
		}
		out.print("serlvet Name: " + servletConfig.getServletName());

		out.println("<h4>Servlet Context for your first servlet page</h4>");
		ServletContext servletContext = servletConfig.getServletContext();
		out.print("serlvet Context Name: " + servletContext.getServletContextName()+"<br>");
		out.print("serlvet Context Path: " + servletContext.getContextPath());
		
		
		/*
		 * Servlet Context --> context-param 
		 */
		out.println("<h4>ServletContext() for your first servlet page</h4>");
		ServletContext context = getServletContext();
		Enumeration<String> contextParamNames = context.getInitParameterNames();
		while (contextParamNames.hasMoreElements()) {
			String string = (String) contextParamNames.nextElement();
			out.print("Context param Names : param value = " + string + " : " + context.getInitParameter(string)+"<br>");
		}
		out.print("<br>");
		out.print("serlvet Context Path: " +context.getContextPath()+"<br>");
		out.print("serlvet Context Info: " +context.getServerInfo()+"<br>");
		
		out.print("<br>");
		Enumeration<String> contextAttrNames =context.getAttributeNames();
		while (contextAttrNames.hasMoreElements()) {
			String string = (String) contextAttrNames.nextElement();
			out.print("Context Attribute Names : Attribute value" + string + " : " +/*context.getAttribute(string)+*/"<br>");
		}
		
	}

}
