package threading;
class item
{
int value ;
boolean valSet=false;
public synchronized void voidputItem(int i)
{
try
{
if (valSet)
{
wait();
}
value=i;
System.out.println("Producer produced item->"+value);
valSet=true;
notify();
}
catch(Exception e)
{
e.printStackTrace();
}
}
public synchronized void getItem()
{
try
{
if(!valSet)
{
wait();
}
System.out.println("->Consumer consumed item->"+value);
valSet=false;
notify();
}
catch (Exception e)
{
e.printStackTrace();
}
}
}
class Producer extends Thread
{
int i;
threading.item item;
public <Item> Producer (Item item)
{
this.item=(threading.item) item;
}
public void run()
{
try
{
while (true)
{
Thread.sleep(1000);
item.voidputItem(i++);
}
}
catch (Exception e)
{
e.printStackTrace();
}
}
}
class Consumer extends Thread
{
item item;
public Consumer(item item)
{
this.item=item;
}
public void run()
{
try
{
while (true)
{
Thread.sleep(10000);
item.getItem();
}
}
catch (Exception e)
{
e.printStackTrace();
}
}
}
public class ITCDemo
{
private static final threading.item item = null;

public static void main(String[] args, item itemitem)
{
itemitem=new item();
Producer pr=new Producer(item);
Consumer cr=new Consumer(item);
pr.start();
cr.start();
}
}