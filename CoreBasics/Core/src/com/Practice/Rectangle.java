package com.Practice;

public class Rectangle extends Shape {
	private int len;
	private int Bred;
	
	public Rectangle() {}
		public Rectangle( int l, int b) {
			len= l;
			Bred= b;
	}
	public void area () {
		double area = ( double)len *Bred;
		
		
		System.out.println("area of rectanle" + area );
	}
	

	

}
