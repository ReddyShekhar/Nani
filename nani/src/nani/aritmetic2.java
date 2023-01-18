package nani;

public class aritmetic2 
{
private
int a,b,sum,mul;
public void acceept()
{
a=225;
b=210;	
}
public void process()
{
sum=a+b;
mul=a*b;
}
public void display()
{
System.out.println("sum="+sum);
System.out.println("mul="+mul);
}
public static void main(String[] args) 
{
aritmetic2 a=new aritmetic2();
a.acceept();
a.process();
a.display();


	}

}
