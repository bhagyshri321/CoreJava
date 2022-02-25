package com.CollectionFamework;

import java.util.Stack;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		
		
		Stack s = new Stack();
		for(char i = 'a'; i<='z';i++) {
		
		s.push(i);  }
		
		System.out.println("1st Stack" +  s);
		
		
		
		Stack s1 = new Stack();
		char value;
		for(int i = 'a';i<='z';i++) {
		
		value=(char)s.peek();
		
		s1.push(value);
		s.pop();}
		System.out.println("second stack" + s1);
		
		
		
		Stack s2 = new Stack();
		for(int i = 'a'; i<='z'; i++) {
			
			value = (char) s1.peek();
			s2.push(value);
			s1.pop();
			
		}
		
		System.out.println(" 3rd Stack"+ s2);
		
		
		
		
		
		 
		
	}

}
