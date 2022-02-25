package com.rays.basics;

public class Testclass {
	public static void main(String[] args) {
		
		Shape [] s = new Shape [2];
		s[0]= new Rectangle(5,6);
		s[1]= new Triangle(4,5);
		
		double totalArea=calcArea(s);
		System.out.println(totalArea);
		int i=2;
	Shape s1=getshape(i);System.out.println("rec" + s1.area());
	
	}
	
	
		public static double calcArea(Shape[] s) {
			double 	totalArea=0;
		for (int i= 0;i<s.length;i++) {
			 	totalArea += s[i].area();
			 	System.out.println(s[i].area());
		}
	return totalArea;
	}
public static Shape getshape(int i) {
	if(i==1) return new Rectangle(8,7); 
	
	if(i==2) return new Circle (9);

	if(i==3) return new Triangle (8,9);
	return null;

}
}
