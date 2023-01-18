package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Exp1
{
public static void main(String[] args) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani1","root","Nani@2425");
Statement stmt=con.createStatement();
//String sql="create table reddy20(id int,name varchar(40),city varchar(40))";
String sql="insert into reddy20 values (30,'kalyan','btech','ctr')";
stmt.execute(sql);
con.close();
System.out.println("done");
}
}