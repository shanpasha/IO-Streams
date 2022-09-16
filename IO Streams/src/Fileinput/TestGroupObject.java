package Fileinput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestGroupObject {
	public static void main(String[] args) {
		
		DataStoresIntoTxt a1=new DataStoresIntoTxt(4465655656l, "shan", "andb", "1655825545");
		DataStoresIntoTxt a2=new DataStoresIntoTxt(4465655656l, "shanpasha", "sbi", "165545");
		DataStoresIntoTxt a3=null;
		DataStoresIntoTxt array[]= {a1,a3,a2,};
		FileOutputStream file=null;
		try {
			file=new FileOutputStream("groupOfObj.txt");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (DataStoresIntoTxt dataStoresIntoTxt : array) {
			
			
			try {
				byte a[]=dataStoresIntoTxt.toString().getBytes();
				file.write(a);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException aa) {
				aa.getMessage();
			}
			
			
			System.out.println("success");
			
		}
		
		
	}
	
		
	}


