package filehandlingg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtest
{
public static void main(String[] args) throws IOException
{
FileReader fr=new FileReader("src/write.txt");
BufferedReader br=new BufferedReader(fr);
System.out.println(br.readLine()+"/n");
}
}
