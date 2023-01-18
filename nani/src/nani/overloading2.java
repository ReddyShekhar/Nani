package nani;
public class overloading2
{
void m1(char ch)
{
System.out.println("ch="+ch);
}
void m1(int i)
{
System.out.println("i="+i);
}
void m1(int i, int j)
{
System.out.println(i+"------"+j);
}
public static void main(String[] args)
{
overloading2 t=new overloading2();
t.m1('a');
t.m1(2462);
t.m1(2425,3324);
}
}
