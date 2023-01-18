package com.text;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class Listener implements HttpSessionListener
{
ServletContext ctx=null;
static int total,current=0;
public void sessionCreated(HttpSessionEvent se) 
{ 
total++;
current++;
ctx=se.getSession().getServletContext();
ctx.setAttribute("total,total", se);
ctx.setAttribute("curent",current);
}
public void sessionDestroyed(HttpSessionEvent se)
{ 
current--;
ctx.setAttribute("current",current);
}
	
}
