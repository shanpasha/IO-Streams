package FileHandling;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File file =new File("src/FileHandling/FileDirectory.java");
		System.out.println(	file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
	}

}
