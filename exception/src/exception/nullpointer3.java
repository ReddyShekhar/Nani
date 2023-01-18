package exception;

public class nullpointer3
{
static String str="harshi";
public static void main(String[] args)
{
try
{
Integer.parseInt(str);
}
catch (NumberFormatException e)
{
System.out.println(e);
}
}
}
