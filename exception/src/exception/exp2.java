package exception;

public class exp2
{
public static void main(String[] args)
{
try
{
System.out.println(2425/2);
}
catch (Exception n)
{
System.out.println(n.getMessage());
System.out.println(n);
n.printStackTrace();
}
}
}
