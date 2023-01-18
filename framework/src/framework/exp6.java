package framework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class exp6
{
private static final int Key = 0;

public static void main(String[] args)
{
Map<String,Integer>hm=new TreeMap<String,Integer>();
hm.put("dell", 200);
hm.put("lenovo",90);
hm.put("asus",300);
hm.put("sony",4000);
hm.put("apple",8399);
hm.put("dell",500);
System.out.println(hm);
Iterator<Entry<String,Integer>>itr=hm.entrySet().iterator();
while(itr.hasNext())
{
Entry<String,Integer>et=itr.next();
System.out.println(et.getKey()+""+et.getValue());
}
for (String key:hm.keySet())
{
System.out.println(Key+""+hm.get(Key));
}
}
}
