package com.Practice;

public class TestShape  {
	public static void main(String[] args) {
		Shape s = new Rectangle(5,45);
		s.setBorderwidth(5);
		s.setColor("Red");
		s.area();
	
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
		
		
	}

	
	}


