package nani;

 class bhav
{
int a=10,b=20;
}
class shek extends bhav
{
int a=100,b=200;
void add(int a,int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
}
class bhavya3
{
public static void main(String[] args)
{
shek t=new shek();
t.add(100, 200);
}
}
