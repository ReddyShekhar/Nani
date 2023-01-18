package exception;

public class exp7
{
public static void main(String args[])
{
try
{
int a[]={10,20,30,40};
System.out.println(a[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}

}
