package com.rays.basics;

public class largestnoofArray {

	public static void main(String[] args) {
		
		
		
		int []a = {1,2,3,4,5};
		
		int b= a[0];int c=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>b) {
			
				c=b;
				b=a[i];
			
			}else if(a[i]>c ) {
				c=a[i];
			}
		}System.out.println("greater value is"+ c);
		
	}
}  
