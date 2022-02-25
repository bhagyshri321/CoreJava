package com.CollectionFamework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;



public class Iterator {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(45);
		a.add(56);
		a.add(85);
		a.add(56);
		
		java.util.Iterator it = a.iterator();
		// a.add(45);   iterator is fail fast
		
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
			
			
			
			
			
			 Vector a1= new Vector();
				a1.add(56);
		     	a1.add(50);
		         a1.add(54);
				
				Enumeration e = a1.elements();
				
				a1.add(45);
				
				while(e.hasMoreElements()) {
					Object ob = e.nextElement();
					System.out.println(ob);
		
		}
		}
		
	}}
		
		
	


