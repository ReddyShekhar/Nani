package exception;
public class exp8
{
public static void main(String[] args)
{
try
{
int[] a=new int[5];
a[5]=30/0;
}
catch (ArithmeticException e)
{
System.out.println("arithmetic error");
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("arrayindexoutofbondsException e");
}
catch (Exception e)
{
System.out.println("parameter exception e");
}
}
}

