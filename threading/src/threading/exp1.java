package threading;
public class exp1 extends Thread
{
public void run()
{
System.out.println("i am from run method");
}
public static void main(String[] args)
{
exp1 t1=new exp1();
exp1 t2=new exp1();
exp1 t3=new exp1();
System.out.println("Default thread name:"+t1.getName());
System.out.println("Default thread name:"+t2.getName());
System.out.println("Default thread name:"+t3.getName());
t1.setName("open ac");
t2.setName("withdraw");
t3.setName("transfer");
System.out.println("thread name:"+t1.getName());
System.out.println("thread name:"+t2.getName());
System.out.println("thread name:"+t3.getName());
System.out.println("Default thread name:"+t1.getPriority());
System.out.println("Default thread name:"+t2.getPriority());
System.out.println("Default thread name:"+t3.getPriority());
System.out.println("MAX_PRIORITY");
System.out.println("MIN_PRIORITY");
System.out.println("thread priority:"+t1.getPriority());
System.out.println("thread priority:"+t2.getPriority());
System.out.println("thread priority:"+t3.getPriority());
}
}
