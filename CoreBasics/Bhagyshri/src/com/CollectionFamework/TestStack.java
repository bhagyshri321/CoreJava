package com.CollectionFamework;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add("");
		s.add(4);
		
	    s.peek();
		s.peek();
		System.out.println(s.pop());
		System.out.println(s);
		
		
		
		s.peek();
		System.out.println(s.peek());}

}
