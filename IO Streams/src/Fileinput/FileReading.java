package Fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file= new File("C:\\Users\\new\\Music\\Employee.java");
		FileInputStream input=null;
		try {
		 input= new FileInputStream(file);
			int f=0;
			while ((f=input.read())!=-1) {
				System.out.print((char)f);
				
			}
 
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				input.close();
				System.out.println("successfully Closed");
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	

}
