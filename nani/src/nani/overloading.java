package nani;

public class overloading
{
private
int a,b;
public void display(int x, int y)
{
a=x;
b=y;
}
public void output()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
public static void main(String[] args)
{
overloading t=new overloading();
t.display(24,33);
t.output();
}
}
