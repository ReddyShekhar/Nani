package nani;

public class staticmethod2
{
static int atmpin=2425;
static int pincode=516214;
public void  display()
{
System.out.println(pincode);
staticmethod2 obj=new staticmethod2();
System.out.println(obj.atmpin);
}
public void show()
{
System.out.println(atmpin);
System.out.println(staticmethod2.pincode);
}
public static void main(String[] args)
{
staticmethod2 t=new staticmethod2();
t.display();
t.show();
}
}
