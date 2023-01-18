package nani;

public class bhavya2
{
static int a;
int b;
void values(int a, int b)
{
this.a=a;
this.b=b;
}
void add()
{
System.out.println(a+b);
}
void mul()
{
System.out.println(a*b);
}
public static void main(String[] args)
{
bhavya2 t=new bhavya2();
t.values(100, 200);
t.add();
t.mul();
}
}
