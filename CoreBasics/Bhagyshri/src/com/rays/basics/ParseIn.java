package com.rays.basics;

import java.io.IOException;

public class ParseIn {
public static void main(String[] args) throws IOException {
	String s = args[0];
 int i= Integer.parseInt(args[1]);
 int j= Integer.parseInt(args[2]);
 
	switch (s ) {
case "add": 
	System.out.println("sum of values: "+i+j);
	break; 
case "sub": 
	System.out.println("sub of values: "+(i-j));
	break;
case "mul": 
	System.out.println("mul of values: "+(i*j));
	break;
 
default:
	System.out.println("div of values: "+(i/j));
	break;

	
}
}
}
