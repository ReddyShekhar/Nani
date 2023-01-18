package exception;

public class exp6
{
public static void main(String[] args)
{
int i=50,j=0,a;
try
{
a=i/j;
}
catch (ArithmeticException e)
{
System.out.println(i+j/0);	
}
System.out.println("rest of the programm");
}
}

