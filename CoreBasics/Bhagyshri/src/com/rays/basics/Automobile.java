package com.rays.basics;

public class Automobile {

	private String color=null;
	private int speed =0;
	private String make= null;
	public static final int GEARS = 5;
	


	

	public void setcolor(String color) {
	this.color= color;	
}

	public String getcolor(){
	return color;}
	
	public void setspeed(int speed) {
		this.speed= speed;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setmake(String make) {
		this.make= make;
		
	}
	
	public String getmake() {
		return make;
	}

	public void brake() {
		System.out.println("stop"); 
	}


}