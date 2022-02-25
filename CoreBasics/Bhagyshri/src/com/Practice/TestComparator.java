package com.Practice;

import java.util.Comparator;

public class TestComparator implements Comparator <Marksheet>{
     
    public int compare(Marksheet m1, Marksheet m2) {
	
    	if (m1.getFname()== m2.getFname()) {
    		
    		return  m1.getLname().compareTo(m2.getLname());
    	}
			
		 else { return m1.getFname().compareTo(m2.getFname());
}
}}