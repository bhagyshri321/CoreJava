package com.rays.basics;

public class Rectangle extends Shape{

	private int Len;
	private int wid;
	
	public Rectangle() {}
		public Rectangle ( int L, int w) {
			Len= L;
			wid= w;
			}
		
		public void area () {
			double area = Len *wid;
		
		}
	}

