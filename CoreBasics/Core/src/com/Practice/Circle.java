package com.Practice;

public class Circle extends Shape {
	
	private int radius;

	public Circle() {}
	public Circle (int i) {
		radius =  i;
	}
		
	

	
	public void area() {
		double area =  (double)Math.PI*radius*radius;
		
		System.out.println("area of circle" + area) ;
	}

}
