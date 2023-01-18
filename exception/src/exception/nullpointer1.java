package exception;

public class nullpointer1
{
static String str="harshi";
public static void main(String[] args)
{
try
{
System.out.println(str.length());
}
catch (StringIndexOutOfBoundsException e)
{
	System.out.println(e);
	
}
}

}
