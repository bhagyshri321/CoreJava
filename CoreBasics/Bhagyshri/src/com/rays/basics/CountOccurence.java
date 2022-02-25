package com.rays.basics;

public class CountOccurence {

	
	public static void main(String[] args) {
		
		String  t= "malyalam";
		
		char c = 'm';
		
		int s = 0;
		
		for(int i= 0;i<t.length();i++) {
			
			if(c==t.charAt(i)) {
				
				s++;
				}
			
		}
		System.out.println(s);
	}
}
		
		
		
	

	