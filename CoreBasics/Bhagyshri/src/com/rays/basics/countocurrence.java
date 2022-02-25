package com.rays.basics;

public class countocurrence {
	public static void main(String[] args) {
		
		
		String s= "Bhagyshri Saxena";
		
		char c= 'P';
		int count = 0;
		
		for(int i=0;i<s.length(); i++) {
			if (s.charAt(i)==c) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
