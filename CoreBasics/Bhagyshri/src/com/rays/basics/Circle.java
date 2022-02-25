package com.rays.basics;

public class Circle extends Shape  {

	private int radius;
	
public Circle() {}
public Circle(int i) {this.radius=i;}
		public int  getradius() {
	        return radius;}

     public double  area () {
    	 double area = (double)Math.PI *radius *radius;
    	 return area;
    	
     }

}