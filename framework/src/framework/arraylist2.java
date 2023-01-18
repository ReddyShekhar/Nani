package framework;
import java.util.*;
public class arraylist2
{
private static final Object O = null;

public static void main(String[] args)
{
List<String> h=new ArrayList<String>();
h.add("shekhar");
h.add("24");
h.add("null");
h.add("nani");
h.add("baby");
h.add("bh.shekhar");
Collections.sort (h);
for (String v:h)
{
System.out.println(v);
}
h.remove(O);
System.out.println(h);
h.add(1,"kalyan");
System.out.println(h);
}
}
