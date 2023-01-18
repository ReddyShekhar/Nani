package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Register")
public class Register extends HttpServlet
{
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	response.setContentType("text/html");
	
PrintWriter out =response.getWriter();

String name=request.getParameter("fname");
String user=request.getParameter("user");
String pass=request.getParameter("pwd");
if(name.equals("admin"))
{
//out.println("login sucess");
	RequestDispatcher rd=request.getRequestDispatcher("login.html");
	rd.forward(request,response);

}
else
{
	//out.println("login failed");
	out.println("<font color='red'>register failed</font>");
	RequestDispatcher rd=request.getRequestDispatcher("Register.html");
	rd.include(request,response);

}

}

}
