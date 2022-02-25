package com.rays.basics;

public class AverageOfNEven {

	
	public static void main(String[] args) {
	int  b=0;int c=0;int x=0;int y=0;
		for(int a=1;a<10;a++) {
			
			if(a%2==0) {
				x++;
			b+=a;
			System.out.println("even"+b);
			}
			else {
				y++;
			c+=a;	
			System.out.println("odd"+a);
			}
			
		}
			System.out.println("total avg even"+b/x);
			System.out.println("total avg odd"+c/y);
	
		
		
			
			
		
		
	}
}
