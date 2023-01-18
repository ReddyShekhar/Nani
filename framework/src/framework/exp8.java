package framework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class exp8
{
private static final String String = null;

public static <Employee> void main(String[] args)
{
Map<Employee,Integer>data=new HashMap<Employee,Integer>();
/*data.put(newEmployee(1,"king","Blr"),234);
data.put("lenovo",474);
data.put("asus",123);
data.put("dell",234);
data.put("sony",244);
data.put("apple",456);
data.pur("mac",244);
System.out.println(data);
 */
LinkedHashMap<String,Integer>dat=new LinkedHashMap<>();
dat.put("sony",234);
dat.put("lenovo",474);
dat.put("asus",123);
dat.put("dell",256);
dat.put("sony",567);
dat.put("apple",456);
dat.put("mac",647);
System.out.println(dat);
Iterator<Entry<String, Integer>>itr=dat.entrySet().iterator();
while (itr.hasNext())
{
Entry <String,Integer>et=itr.next();
System.out.println(et.getKey()+""+et.getValue());
}
for (String ky:dat.keySet())
{
System.out.println("key:"+ky+"Value:"+dat.get(ky));
}
for (Integer val:dat.values())
{
System.out.println(val);
}
}
}