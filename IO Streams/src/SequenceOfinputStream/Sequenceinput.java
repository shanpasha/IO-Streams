package SequenceOfinputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequenceinput {
	public static void main(String[] args) {

		try 
		(FileInputStream file1 = new FileInputStream("src/SequenceOfinputStream/Cricketlist.txt");
				
		FileInputStream file2 = new FileInputStream("src/SequenceOfinputStream/ProKabaddilist.txt");) {

			SequenceInputStream twofile = new SequenceInputStream(file1, file2);
			int i = 0;
			while ((i = twofile.read()) != -1) {

				System.out.print((char) i);

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