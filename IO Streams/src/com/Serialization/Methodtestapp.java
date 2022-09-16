package com.Serialization;

import java.io.IOException;


public class Methodtestapp {
	public static void main(String[] args) throws IOException {
		
		College St=new College(01, "shan", 123);
		College St1=new College(02, "pooja", 1253);
		College St3=new College(03, "mahesh", 12536);
		
		College s[]= {St,St1,St3};
		
		
		//SerializationMethod.Serialization("G:\\s\\Serializatio", St);
		DeSerializationMethod
		.DeSerializationMethod("G:\\s\\Serializatio");
		
		//methodsSerialization.Serialization(path, obj);
	}

}
