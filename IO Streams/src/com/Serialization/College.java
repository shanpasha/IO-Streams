package com.Serialization;

import java.io.Serializable;

public class College implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 int id ;
	String name;
	static String COLLEGENAME;
	 int password;
	public College(int id, String name, int password) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCOLLEGENAME() {
		return COLLEGENAME;
	}
	public static void setCOLLEGENAME(String cOLLEGENAME) {
		COLLEGENAME = cOLLEGENAME;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	

}
