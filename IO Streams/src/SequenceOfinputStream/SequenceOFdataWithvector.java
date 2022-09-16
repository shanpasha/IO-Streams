package SequenceOfinputStream;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import com.BufferinputOutputStreams.Cricket;
import com.BufferinputOutputStreams.Gender;
import com.BufferinputOutputStreams.ProKabaddi;

public class SequenceOFdataWithvector {
	
	public static void main(String[] args) {
		
	try(
			BufferedWriter bof=new BufferedWriter(new FileWriter("G:\\s\\shan.txt"))) {
		
	
		Cricket p1=new Cricket("virat", "Cricket", "55", Gender.male, 2036, 10, 7);
		Cricket p2=new Cricket("rohit", "Cricket", "30", Gender.male, 3036, 8, 5);
		Cricket p3=new Cricket("pandya", "Cricket", "35", Gender.male, 4036, 6, 7);
		Cricket p4=new Cricket("kl rahul", "Cricket", "60", Gender.male, 5036, 8,10);
		
		ProKabaddi P1=new ProKabaddi("rahul Chowdary"," kabaddi", "10",Gender.male, 500, 20);
		ProKabaddi P2=new ProKabaddi("mahesh", "kabaddi","20", Gender.male, 600, 10);
		ProKabaddi P3=new ProKabaddi("kumar", "kabaddi","25", Gender.male, 700, 15);
		
		
		
		Vector vector=new Vector();
		
		vector.add(p1);
		vector.add(p2);
		vector.add(p3);
		vector.add(p4);
		vector.add(P1);
		vector.add(P2);
		vector.add(P3);
		
		for (Object object : vector) {
			//byte b []=object.toString().getBytes();
			
			bof.write( object.toString());
			
			bof.newLine();
			
			
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		
		
			
			
			
			
		
	
	}

}
