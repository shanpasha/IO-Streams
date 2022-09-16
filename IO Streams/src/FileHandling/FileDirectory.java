package FileHandling;

import java.io.File;

public class FileDirectory {
	public static void main(String[] args) {
		
	
	
	
	File CurrentPath=new File("IO Streams//src//FileHandling");
	File file=new File(CurrentPath+"//FileDirectory.java");
	file.mkdirs();
	
	
	File MakeDir=new File(CurrentPath+"//shan//pasha");
	if (MakeDir.exists()) {
		
		MakeDir.renameTo(new File(CurrentPath+"//shan//pasha"));
		
	}
	System.out.println(file.canRead());
	System.out.println(file.getAbsolutePath());
	
MakeDir.mkdirs();
	System.out.println(MakeDir.canRead());
	}

}
