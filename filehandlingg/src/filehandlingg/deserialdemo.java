package filehandlingg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialdemo
{
public static void main(String[] args) throws IOException, ClassNotFoundException
{
FileInputStream fis=new FileInputStream("src/customer.txt");
ObjectInputStream ois=new ObjectInputStream (fis);
cust obj=(cust)ois.readObject();
System.out.println(obj.id+""+obj.city+""+obj.pin);
}
}
