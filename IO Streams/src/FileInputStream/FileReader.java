package FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) {
		
		
	File f=new  File("G:\\s\\NewData.txt");
	
	FileInputStream file=null;
	try {
	 file=new FileInputStream(f);
	 int i=0;
	 while ((i=file.read())!=-1) {
		 
		 byte b[]=file.toString().getBytes();
		 
		 System.out.print((char)i);
	//System.lineSeparator();
		 
	 }
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	

	
	
	
	}

}
