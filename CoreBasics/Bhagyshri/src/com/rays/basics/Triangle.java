package com.rays.basics;

public class Triangle extends Shape {

	
	private int base ;
	private int height;
	
	
	public Triangle() {}
	
	public Triangle (int B, int H) {
		base = B;
		height = H;
	}
	
	
	/*
	 * public int getBase() { return base; }
	 * 
	 * public void setBase(int base) { this.base = base; }
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 */
	public void area () {
		 double area = (double)1/2*base*height;
		return;
		
		
	
}
}