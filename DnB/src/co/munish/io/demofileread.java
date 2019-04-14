package co.munish.io;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class demofileread {

	public static void main(String[] args) throws IOException {
		File fil=new File("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes.txt");
		FileInputStream fis=null;

int content;
try 
{
	fis=new FileInputStream(fil);
	System.out.println(fis.available());
	while ((content=fis.read()) !=-1)
	{
		
		System.out.println((char)content);
	}	
}
catch (Exception e)
{
	System.out.println("Exception");
}

	}
	

}
