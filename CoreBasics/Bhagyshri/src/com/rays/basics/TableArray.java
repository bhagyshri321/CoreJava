package com.rays.basics;

public class TableArray {
public static void main(String[] args) {
	
 int [][] k= new int [10][9];
 
  for(int i =0;i<k.length;i++) {
	  
	  System.out.println();
	  
	  for(int d =0; d<k[i].length; d++ ) {
		  
		  k[i][d] = (i+1)*(d+2);
		  
		System.out.print(k[i][d]+"\t");
	  }
  }
	
	  
}
	
	
}
