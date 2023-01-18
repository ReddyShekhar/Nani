package exception;

public class exp4
{
public static void main(String[] args)
{
try
{
int a=50/0;
System.out.println("rest of the programm");
}
catch (ArithmeticException e)
{
System.out.println(e);
}
}
}

