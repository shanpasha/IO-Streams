package FileHandling;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAdirectory { 
	public static void main(String[] args) {
		File createNewDirectory =new File("IO Streams//src//FileHandling//EmployeeList");
		createNewDirectory.mkdirs();
	
		 EmployeeData e=new EmployeeData(01, "mahesh", 30050.070, "Java Developer");
		 EmployeeData e1=new EmployeeData(02, "Kumar", 60050.070, "Java Developer");
		 EmployeeData e2=new EmployeeData(03, "Sriman", 72050.070, "Java Developer");
		 EmployeeData e3=new EmployeeData(04, "Ravi", 45000.070, "Java Developer");
         
		 
		 
		 try (BufferedOutputStream employeeData=new BufferedOutputStream(new FileOutputStream(createNewDirectory+"//employee.txt") );){
			
			 
			 EmployeeData data []= {e,e1,e2,e3};
			 
			 for (EmployeeData em : data) {
				 
				 byte [] a =em.toString().getBytes();
				 employeeData.write(a);
				 
	
				
			}
			 
			 
			 
		} catch (FileNotFoundException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		} catch (IOException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
	
	}

	
	
	
}