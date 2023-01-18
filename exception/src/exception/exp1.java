package exception;

public class exp1
{
public static void main(String[] args)
{
try
{
System.out.println(2425/24);
String[]ar= {"java",".net","php"};
System.out.println(ar[4]);
String str="java";
System.out.println(str.charAt(3));
String s="shekhar";
System.out.println(s.charAt(0));
System.out.println("shekhar");
}
catch(ArithmeticException ae)
{
System.out.println("don't enter zero for den");
}
catch (ArrayIndexOutOfBoundsException aie)
{
System.out.println("check your array name");
}
catch(StringIndexOutOfBoundsException sie)
{
System.out.println("check your string length");	
}
catch (NullPointerException npe)
{
System.out.println("please enter string data to");
}
catch(Exception e)
{
System.out.println("check your inputs");
}
finally
{
System.out.println("shekhar");
}
System.out.println("");
}
}