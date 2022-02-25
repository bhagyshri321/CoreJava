package com.rays.basics;

public class Fibonacciseries {
public static void main(String[] args) {
	
	int a = 0;
	int b = 1;
	int c;
	  
	for(int i=0;i<=10;i++) {
	
	System.out.println(a);
	c= a+b;
	a=b;
	b=c;
	}	
	
	//triangle(k);
	
	int k=123;
	armsg(k);
	
}
public static void triangle(int k) {
	
	for(int i=1;i<=k;i++) {
    for(int j =1;j<=i;j++) {
    	
    	System.out.print(j);
			
		}System.out.println();
	}
	
	
	  
	
}

public static void armsg(int k) {

	int l = k;
	int v=0;
	int w = 0;
	
	
	for(int i =0;k!=0;i++) {
		
		v= k%10;
		
		w+= v*v*v;
		
		k/=10;
		
	}
	if (w==l) {
		System.out.println("Armstrong"+ l);
	}
	else{
		System.out.println("not Armstrong");}
}
}