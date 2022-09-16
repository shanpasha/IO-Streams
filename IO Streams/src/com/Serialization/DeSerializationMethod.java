package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationMethod {
	
	
	public static void DeSerializationMethod(String path)  {
		
	
		
	
	try (ObjectInputStream o=new ObjectInputStream(new FileInputStream(path)) ){
		
Object oo[]= new Object[100];
		
		for (Object object : oo) {
			
			object=(Object)o.readObject();
			System.out.println(object);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
			
		
				}
			
			
			
			
		
			
		           	
			
			 
			 
			 
	
	}


	
	