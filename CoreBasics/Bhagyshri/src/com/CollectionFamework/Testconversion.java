package com.CollectionFamework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Testconversion {
	public static void main(String[] args) {
		
		List a = new Vector ();
		
		a.add("one");
		a.add("two");
		a.add("three");
		
		Integer i = new Integer(4);
		a.add(i);
		
	
		Integer value = (Integer)a.get(3);
		System.out.println(a);
		
		
		
		
		
	}

}
