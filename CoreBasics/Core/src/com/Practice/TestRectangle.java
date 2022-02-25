package com.Practice;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r= new Rectangle(10,20);
		
		r.area();
		r.setBorderwidth(5);
		r.setColor("Black");
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
	}

}
