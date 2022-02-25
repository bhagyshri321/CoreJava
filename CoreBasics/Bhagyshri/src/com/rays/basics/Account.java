package com.rays.basics;

public class Account {
   private String number;
   private String accounttype;
   private double balance; 
  
   
 
   public Account() {}
   public Account(String s,String t,double d) {
	   this.accounttype=t;;
	  this.number=s   ;
	  this.balance=d;
   }
   public void setnumber(String number) {
   this.number= number;
}
    public String getnumber() {
    	return number;
    }
    
    public void setaccounttype(String accounttype) {
    	this.accounttype= accounttype;
    }
    
    public String getaccounttype() {
    	return accounttype;
    	
    }
    
    public void setbalance(double balance) {
    	this.balance= balance;
    	
    }
    public double getbalance() {
    	return balance;
    }
   
     public void withdraw(int i){
    	 
    double d=getbalance();
    	d-=i;
    	 setbalance(d);
    	 
     }
     public void deposit(int j) {
    	 double d=getbalance();
     	d+=j;
     	
     }
     
}