package nani;
class anju
{
void m1()
{
System.out.println("chandra calony");
}
void m2()
{
System.out.println("bypass");
}
}
class anji extends anju
{
void m3()
{
System.out.println("madanapalle");
}
}
public class inheritence1
{
public static void main(String[] args)
{
anji i=new anji();
i.m1();
i.m2();
i.m3();
anju a=new anju();
a.m1();
a.m2();
}
}
