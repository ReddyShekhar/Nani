package nani;

public class method1
{
void add(int d)
{
System.out.println("single argument");
}
void add(double x, float f)
{
System.out.println("double argument");
}
void add(float y)
{
System.out.println("type of the arguments");
}
public static void main(String[] args)
{
method1 t=new method1();
t.add(2425);
t.add(2425,33.55f);
t.add((int)2.5);
t.add(23.45f);
}
}
