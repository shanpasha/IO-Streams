package com.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMethod {

	public static void Serialization  (String path,Object obj) {
		FileOutputStream f=null;
		ObjectOutputStream oos=null;
		try {
			f = new  FileOutputStream(path);
			 oos=new ObjectOutputStream(f);
			oos.writeObject(obj);
			System.out.println("Succesfully Serialization complted...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
finally {
	
	try {
		f.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		oos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("file is closed...!");
}
			
		
	}
	
	
}
