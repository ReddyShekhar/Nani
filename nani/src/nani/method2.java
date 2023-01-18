package nani;

public class method2
{
int method(int x,float y)
{
System.out.println("method1");
return x;
}
void method2()
{
System.out.println("method2");
}
void method3()
{
System.out.println("method3");
}
void method4()
{
System.out.println("method4");
}
public static void main(String[] args)
{
method2 t=new method2();
t.method(24,88.99f);
t.method2();
t.method3();
}
}
