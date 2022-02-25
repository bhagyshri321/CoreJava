package com.ExceptionHandling;

public class TryUnderCatch {

	public static void main(String[] args) {
		try {String s= null;
		System.out.println(s.charAt(5));
		}
		catch (Exception a) {
			System.out.println("String is null");
			
			try {double div = 15/0;
			System.out.println("Division is ");
	 		}
			
			catch(Exception b) {
				System.out.println("Divide by zero"	);
					
			}
		}
	}
}
