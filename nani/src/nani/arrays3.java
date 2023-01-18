package nani;
import java.io.*;
public class arrays3
{
public static void main(String[] args) throws IOException
{
DataInputStream r=new DataInputStream (System.in);
System.out.println("enter n value");
int n=Integer.parseInt (r.readLine ());
int a[]=new int [n];
System.out.println("entered students one by one");
for (int i=1; i<n; i++)
a [i] =Integer.parseInt (r.readLine ());
System.out.println("the eneterd students are");
for (int i=1;i<n;i++)
System.out.println(a[i]+"/t");
}
}
