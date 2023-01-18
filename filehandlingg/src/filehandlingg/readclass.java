package filehandlingg; 
import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class readclass
{
public static void main(String[] args) throws Exception
{
FileInputStream fis=new FileInputStream("src/simple,txt");
BufferedInputStream bis=new BufferedInputStream(fis);
byte [] br=new byte[1024];
int x=0;
while ((x=bis.read(br))!=-1)
{
System.out.println(new String (br,0,x));
}
}
}
