package com.Serialization;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class CollegeTest {
	
	public static void deserialiaztion (){
	 
	 ObjectInputStream ob;
	try {
		ob = new ObjectInputStream(new FileInputStream("src//com//Serialization//college1.ser"));
		College cc[]=new College[3];
	 	
	 	for (College college : cc) {
	 	
			college =(College) ob.readObject();
	 		System.out.println(college);
	 	}
	} catch (IOException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
 	
 	
	}
 		
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		deserialiaztion();
		
		
		
//		College St=new College(01, "shan", 123);
//		College St1=new College(02, "pooja", 1253);
//		College St3=new College(03, "mahesh", 12536);
//		
//		College c[]= {St,St1,St3};
//		//non Serialization
//		FileOutputStream cfile=new FileOutputStream("src//com//Serialization//college1.ser");
//     
//		ObjectOutputStream clg=new ObjectOutputStream(cfile);
//		
//		for (College clgd :c) {
//			 clg.writeObject(clgd);
//			 }
//       System.out.println("success..");
//    
//   
		
    	}
			         
		
    	
     
        
        
        
        
        
        
		
		
		
		
		
	}
	
	

