package Fileinput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStoring {
	public static void main(String[] args) throws FileNotFoundException {
		
		DataStoresIntoTxt c=new DataStoresIntoTxt(123456l, "raj", "andb0023", "7569642122");
		FileOutputStream data=null;
          try {
			data=new FileOutputStream("bankData.txt");
			byte [] tobyte=c.toString().getBytes();
			data.write(tobyte);
			System.out.println("success");
			  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	finally {
		
		if (data!=null) {
			
			try {
				data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
	
}
