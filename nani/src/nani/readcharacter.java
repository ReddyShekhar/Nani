package nani;
import java.io.DataInputStream; 
public class readcharacter 
{
public static void main(String[] args)
{
char n;
DataInputStream r=new DataInputStream(System.in);
try
{
System.out.println("enter a----d");
n=(char)System.in.read();
switch(n)
{
case 'a':
System.out.println("apple");
break;
case'b':
System.out.println("ball");
break;
case'c':
System.out.println("cat");
break;
case'd':
System.out.println("dog");
break;
default:
System.out.println("no matching");
}
}
catch(Exception e)
{
}
}
}
