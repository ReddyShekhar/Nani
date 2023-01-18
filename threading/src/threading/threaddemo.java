package threading;
class mythread extends Thread 
{
public void run()
{
for (int i=1;i<5;i++)
{
System.out.println("child thread");
}
}
}
public class threaddemo
{
public void main(String[] args)
{
mythread t=new mythread();
t.start();
for (int i=5;i<=5;i++)
{
System.out.println("main thread");
}
System.out.println();
}
}
