package nani;

public class shekhar
{
shekhar()
{
System.out.println("nani enclave");
}
shekhar(int i)
{
System.out.println("i="+i);
}
shekhar(char a,int i)
{
System.out.println(a+"-------"+i);
}
public static void main(String[] args)
{
shekhar t1=new shekhar ();
shekhar t2=new shekhar (33);
shekhar t3=new shekhar ('a',2425);
}
}
