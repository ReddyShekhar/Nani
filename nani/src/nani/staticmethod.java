package nani;

class reddy
{
static int x=10;
void display ()
{
x++;
System.out.println("x"+x);
}
}
public class staticmethod
{
public static void main(String[] args)
{
reddy s1=new reddy();
s1.display();
reddy s2=new reddy();
s2.display();
}
}
