package com.InputOutput;

import java.io.File;
import java.util.Date;

public class TestInputOutput {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\hp\\Downloads ");
		System.out.println(f.length());
		System.out.println(new Date(f.lastModified()));
		
	 
	}
	 

}
