package com.InputOutput;

import java.io.File;

public class OnlyFiles2 {
	public static void main(String[] args) {
		File directory = new File("C:\\Users\\hp\\Documents\\New folder");
		
		File []list =directory.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				System.out.println( );
			}
		}
		
	}

}
