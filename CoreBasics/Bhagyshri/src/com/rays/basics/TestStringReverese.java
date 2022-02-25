package com.rays.basics;

public class TestStringReverese {
public static void main(String[] args) {

	String s = "Bhagyshri Saxena";
	
	
System.out.println(s);
	for(int i= s.length();i>=1;i--) {
		
		System.out.print(s.charAt(i-1));
	}
	
	System.out.println();
	
   String  [] B = s.split(" ");
   
   for(String t: B) {
	   
	   System.out.println(t);
   }
   
	
	for(String t:B) {
		
		for(int i=t.length();i>=1;i--) {
			
		System.out.print(t.charAt(i-1));
		}
	}
	
	
	
	
}
	
}
