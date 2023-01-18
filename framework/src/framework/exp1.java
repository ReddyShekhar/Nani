package framework;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class exp1
{
public static void main(String[] args)
{
List<String>names=new ArrayList<String>();
names.add("nani");
names.add("shekhar");
names.add("kalyan");
names.add("eswari");
names.add("jayanna");
names.add("baby");
names.add("reddy");
names.add("bharathi");
names.add("bh.shekhar");
List<String>fit=names.parallelStream().sorted().collect(Collectors.toList());
fit.forEach(n->System.out.println(n));
}
}
