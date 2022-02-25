package com.rays.basics;

public class Palindrome {

	public static void main(String[] args) {
		
		int n= 157;
		int l=n;
		int r=0;
		for(int i=0;n>0;i++) {
			int d=n%10;
			
			r=d+(r*10);
			n/=10;
			}
		System.out.println(r);
}}
