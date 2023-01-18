package exception;

public class exp3
{
public static void main(String[] args)
{
try
{
int a=100/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
