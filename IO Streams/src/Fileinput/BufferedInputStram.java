package Fileinput;

import java.io.*;

public class BufferedInputStram {

	public static void main(String[] args) {
		
		FileInputStream f;
		try {
			f = new FileInputStream("G:\\s\\NewData.txt");
			
			BufferedInputStream b = new BufferedInputStream(f);
			 int i;
			 while ((i=b.read())!=-1) {
				 
				 System.out.print((char)i);
				 
				 
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
