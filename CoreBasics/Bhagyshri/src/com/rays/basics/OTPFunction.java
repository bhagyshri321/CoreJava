package com.rays.basics;

public class OTPFunction {
  
	public static void main(String[] args) {
					
	/*	
		for (int i =0;i<=5;i++) {
		System.out.println((int)(Math.random()*100));
		}
*/
		divideby7();
		
}
	public static void  divideby7() {
	
		 int k=0;
			
			for(int j =100;j<200;j++) {
		
			if(j%7==0)
		System.out.println(j);
			k+=j;
			}
System.out.println(k);



}}

