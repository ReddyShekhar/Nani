package filehandlingg;

import java.io.FileWriter;
import java.io.IOException;

public class writetest
{
public static void main(String[] args) throws IOException
{
FileWriter fw=new FileWriter("src/write.txt");
String msg="This is char stream file writing operation";
fw.write(msg);
fw.flush();
System.out.println("done.");
}
}
