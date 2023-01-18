package threading;

public abstract class Exp2 implements Runnable
{
private static ThreadGroup tg1;
private static ThreadGroup tg2;
@Override
public void run()
{
System.out.println("i am from run ():"+Thread.currentThread().getName());
}
public static void main(String[] args)
{
exp3 t1=new exp3 ();
//t1.start();
ThreadGroup g1=new ThreadGroup("bank");
Thread t2=new Thread(tg1,t1,"pen AC");
Thread t3=new Thread(tg1,t1,"withdraw");
Thread t4=new Thread(tg1,t1,"transfer");
ThreadGroup g2=new ThreadGroup("maths");
Thread t5=new Thread(tg1,t1,"add");
Thread t6=new Thread(tg1,t1,"sub");
Thread t7=new Thread(tg1,t1,"div");
t4.start();
t6.start();
System.out.println("Threadgroup 1:"+tg1.activeCount());
System.out.println("Threadgroup 2:"+tg2.activeCount());
System.out.println(tg1);
}
}
