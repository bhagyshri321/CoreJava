package com.ExceptionHandling;

public class TryUnderFinally {

	public static void main(String[] args) {
		
		try {String s= null;
		System.out.println(s.charAt(5));
		}
		
		catch (Exception a) {
			System.out.println("String is null");} 
			
		
		finally { System.out.println("finally");
		
		
		try {double div = 15/0;
		System.out.println("Division is ");
		}
		
		catch(Exception b) {
			System.out.println("Divide by zero"	);
				
		}
		
		}
	}
}
