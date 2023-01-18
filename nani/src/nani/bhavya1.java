package nani;
public class bhavya1
{
int a=10;
int b=20;
void add(int a,int b)
{
System.out.println(a+b);
System.out.println(this .a+this.b);
}
public static void main(String[] args)
{
bhavya1 t=new bhavya1();
t.add(100, 200);
}
}
