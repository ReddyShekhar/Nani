package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class exp3
{
public static void main(String[] args) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("dbs:mysql://localhost:3306/shekhar","root","Nani@2425");
/*
PreparedStatement pst=con.prepareStatement("insert into nani6 values(?,?,?)");
pst.setInt(1,111);
pst.setString(2,"apple");
pst.setString(3,"tpt");
pst.execute();
PreparedStatement pst=con.prepareStatement("update nani6 setname=? where idd=?");
pst.string(1,"grapes");
pst.setInt(2,111):
pst.execute();
 */
PreparedStatement pst=con.prepareStatement("select*from nani4");
ResultSet rd=pst.executeQuery();
ResultSet rs = null;
while (rs.next())
{
System.out.println("id:"+rs.getInt(1)+"name:"+rs.getString(2)+"city:"+rs.getString(3));
}
System.out.println("Done");
}
}
