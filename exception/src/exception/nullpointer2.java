package exception;

public class nullpointer2
{
static String str="nullpointer2";
public static void main(String[] args)
{
try
{
System.out.println(str.charAt(3));
System.out.println(str.charAt(10));
}
catch (StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}
