package com.rays.basics;

public class Automobile1 {
public static void main(String[] args) {
	
		
	
	
	
	
	Automobile a= new Automobile();
	a.setcolor("Blue");
      a.setspeed(45);
       a.setmake("honda");
       a.brake();
   
       
       
       System.out.println(a.getcolor());
       System.out.println(a.getspeed());
       System.out.println(a.getmake());
	
       Account b = new Account();
		
		b.setnumber("4587524");
		System.out.println(b.getnumber());
		
		b.setaccounttype("saving account");
		System.out.println(b.getaccounttype());
		
		b.setbalance(2000.89);
		System.out.println(b.getbalance());
		
	       b.withdraw(1000);
		System.out.println(b.getbalance());
		
		 b.deposit(3000);
		System.out.println(b.getbalance());
		
	Account a1=new Account ("123ram","current",3000);
	System.out.println(a1.getnumber());
	System.out.println(a1.getaccounttype());
	System.out.println(a1.getbalance());
a1.deposit(5000);
System.out.println();


}
}
