package com.test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class exp2
{
public static void main(String[] args) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani1","root","Nani@2425");
Statement stmt=con.createStatement();
String sql="create table reddy19(id int,name varchar(50),city varchar(50))";
String sql1="insert into reddy19 values(300,'reddy','tpt')";
String sql2="update reddy19 set name ='java notes' where id=20";
String sql3="select *from nani4";
ResultSet rs=stmt.executeQuery(sql2);
while (rs.next())
{
System.out.println("id:"+rs.getInt(1)+"name:"+rs.getString(2)+"city:"+rs.getString(3));
}
}
}