package filehandlingg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialdemo
{
public static void main(String[] args) throws IOException
{
FileOutputStream fos=new FileOutputStream("src/customer.txt");
ObjectOutputStream os=new ObjectOutputStream(fos);
cust cc=new cust();
cc.id=11;
cc.name="Hero";
cc.city="Blr";
cc.pin=560069;
os.writeObject(cc);
System.out.println("done.");
}
}