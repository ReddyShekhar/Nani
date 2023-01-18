package filehandlingg;
import java.io.File;
import java.io.FileOutputStream;
public class writeclass
{
public static void main(String[] args)throws Exception
{
File file=new File("src/simple.txt");
FileOutputStream fos=new FileOutputStream(file);
String msg="hi this is file write operation using byte stream";
fos.write(msg.getBytes());
System.out.println("done.");
}
}