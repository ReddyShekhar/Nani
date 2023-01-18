<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USER Details</h1>
<%
String name=request.getParameter("user");
String pass=request.getParameter("pwd");
if(name.equals("admin")&&pass.equals("admin"))
{
//out.println("Name:"+name);
//out.println("password"+pass);
response.sendRedirect("https://WWW.google.com/");
}
else
{
out.println("invalid crediantials");
RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
rd.include(request,response);
}
%>
</body>
</html>