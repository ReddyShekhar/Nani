package framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class arraylist1
{
public static void main(String[] args)
{
List<String> h=new ArrayList<String>();
h.add("apple");
h.add("bananna");
h.add("apple");
h.add("mango");
Iterator b=h.iterator();
while (b.hasNext());
{
System.out.println(b);
}
}
}
