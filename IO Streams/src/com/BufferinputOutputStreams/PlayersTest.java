package com.BufferinputOutputStreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;




import Fileinput.BufferedInputStram;

public class PlayersTest {
	public static void main(String[] args) {
		
		File Cricket=new File("IO Streams//src//com//BufferinputOutputStreams//Cricket");
	File Pro=new File("IO Streams//src//com//BufferinputOutputStreams//Pro kabaddi");
		 Pro.mkdirs();
	    Cricket.mkdirs();
		System.out.println("Sucess");
		
		
		Cricket p1=new Cricket("virat", "Cricket", "55", Gender.male, 2036, 10, 7);
		Cricket p2=new Cricket("rohit", "Cricket", "30", Gender.male, 3036, 8, 5);
		Cricket p3=new Cricket("pandya", "Cricket", "35", Gender.male, 4036, 6, 7);
		Cricket p4=new Cricket("kl rahul", "Cricket", "60", Gender.male, 5036, 8,10);
		
		ProKabaddi P1=new ProKabaddi("rahul Chowdary"," kabaddi", "10",Gender.male, 500, 20);
		ProKabaddi P2=new ProKabaddi("mahesh", "kabaddi","20", Gender.male, 600, 10);
		ProKabaddi P3=new ProKabaddi("kumar", "kabaddi","25", Gender.male, 700, 15);
		
		
		
		try {
			
		
			Cricket [] list= {p1,p2,p3,p4};
			FileOutputStream c=new FileOutputStream(Cricket+"//Cricketlist.txt");
			BufferedOutputStream buf=new BufferedOutputStream(c);
		
			for (Cricket cricket2 : list) {
				
				byte[] b=cricket2.toString().getBytes();
				c.write( b);
				String lineSeparator = System.getProperty("line.separator");
			
				c.write(lineSeparator.getBytes());
				
			
		
			
			
			
			}
			ProKabaddi [] list2= {P1,P2,P3};
			FileOutputStream c1=new FileOutputStream(Pro+"//ProKabaddilist.txt");
			
			for (ProKabaddi pro : list2) {
				
			byte[] bb=pro.toString().getBytes();	
			
			c1.write(bb);
			
			
			}
			
			
			
			
			System.out.println("sucess..");
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
				

		}

}