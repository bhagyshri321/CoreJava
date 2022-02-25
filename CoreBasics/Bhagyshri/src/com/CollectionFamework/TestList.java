package com.CollectionFamework;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(56);
		list.add('a');
		list.add("gabds");
		list.add(220);
		
		list.remove(list);
		list.containsAll(list);
		list.size();
		
	System.out.println(list);
	System.out.println(list.contains(45));
	System.out.println(list.isEmpty());
	System.out.println(list.remove(2));// index number
	System.out.println(list);
	System.out.println(list.size());
	
	
	
	
	
	
		
		
		
		
	
		
		

	     ArrayList a = new ArrayList<>();
	     
	     a.add(45);
	     a.add("rays");
	     a.add(4564);
	     
	     
	     a.addAll(list);
	     
	     
	     a.add(2, "man");
	     

	     System.out.println(a.lastIndexOf("man"));
	     
	     
	     a.get(1);
	   
	     System.out.println(a);
	     System.out.println(a.get(1));
	     
	     a.remove(1);
	     System.out.println(a);
	     
	     a.set(3, "fdbjas");
	     System.out.println(a);
	     
	     a.indexOf(45);
	     System.out.println(a.indexOf(45));
	     a.retainAll(list);
	     System.out.println(a);
	    
	    
	     
	     
	
	}
	}


