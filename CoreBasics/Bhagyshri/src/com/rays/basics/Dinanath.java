package com.rays.basics;

public class Dinanath {

	
public static void main(String[] args) {
	
	
	String s= new String ("Vijay Dinanath Chauhan");
	
	
	System.out.println("String Length-" + s.length());
	System.out.println(s.charAt(6));
	
	System.out.println(s.indexOf("ay"));
	
	System.out.println(s.lastIndexOf("i"));
	
	System.out.println(s.replace("a", "@"));
	
	System.out.println(s.replaceAll("[a-z]", "@"));
	
	System.out.println(s.startsWith("Vijay"));
	
	System.out.println(s.endsWith("han"));
	
	System.out.println(s.substring(5));
			

}
}
