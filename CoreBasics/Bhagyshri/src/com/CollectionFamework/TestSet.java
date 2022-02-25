package com.CollectionFamework;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		 Set s = new TreeSet<>();
		 
		 s.add(85);
		 s.add(45);
		 s.add(22);
		 s.add(12);
		 s.add(12);
		 
		 System.out.println(s);
		 
		 
		 
		 PriorityQueue p = new PriorityQueue();
		 p.add(72);
		 p.add(48);
		 p.add(54);
		 
		 System.out.println(p);
		 
		 p.remove();	
		 p.remove();
		 p.remove();
		 
		 System.out.println(p.poll());
		 
		 
		 Map m= new HashMap();
		 m.put(1, "JAVA");
		 m.put(2, "C++");
		 m.put(3, "Phython");
		 
		 System.out.println(m);
		 System.out.println(m.keySet());
		 System.out.println(m.values());
		 
		 
		 
	}
}
