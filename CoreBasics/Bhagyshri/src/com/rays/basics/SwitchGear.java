package com.rays.basics;

public class SwitchGear {

	public static void main(String[] args) {
		
		int i = 0;
		
		switch(i) {
		
		case '1':
			System.out.println("speed of car is 20");
			break;
			
		case'2':
			System.out.println("speed of car is 40");
			break;
		case '3':
			System.out.println("speed of car is 60");
			break;
			
			default:
				System.out.println("speed of car is neutral");
		
		
		
		int marks =90;
		
		if (marks<50) {System.out.println("You are fail");}
		
		else if (marks>=50 && marks<=70) {System.out.println("Grade is C");
		
		}
		if (marks> 70 && marks<80 ) {System.out.println("Grade is B");
		
	
		}
		if(marks>=80&& marks<=85) {System.out.println("Grade is B++");
		
		}
		if (marks>85&&marks<90) {System.out.println("Grade is A");
		
		}
		if (marks>=90&& marks<100) {System.out.println("Grade is A++");
		}
	}
}}
