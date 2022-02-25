package com.rays.basics;

public class Armstrong {

	public static void main(String[] args) {
		
		int k=123;
		int l = k;
		int v=0;
		int w = 0;
		System.out.println("arm");
		
		for(int i =0;k!=0;i++) {
			
			v= k%10;
			
			w+= v*v*v;
			
			k/=10;
			
		}
		if (w==l) {
			System.out.println("Armstrong"+w);
		}
		else{
			System.out.println("not Armstrong");
		}
	}
}
