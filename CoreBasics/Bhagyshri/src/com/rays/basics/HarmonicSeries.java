package com.rays.basics;

public class HarmonicSeries {

	public static void main(String[] args) {
		
		int n =2;
		
		double a = 1.0;
		
		System.out.print("1+");
		
		while(n<=5) {
			
			a+=  (double) 1/n;
			
			System.out.print("1/"+n+"=");
			n++;
			
			System.out.println(a+"+");
		}
	
	}	
}
