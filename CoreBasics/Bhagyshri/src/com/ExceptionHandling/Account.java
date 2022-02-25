package com.ExceptionHandling;

public class Account {
    
	private  String number;
	private  String accounttype;
	private double balance;
	
	public Account() {}
		public Account (String l, String j, double k) {
			number = l;
			accounttype = j;
			balance = k;
		}
		
		public String getNumber() {
			return number;
		}
       public String getAccounttype() {
			return accounttype;
		}
		
		public double getBalance() {
			return balance;
		}
		
	public void withdraw(double i) {
		double d = getBalance();
		
		
			if(d-i<500) {
				BalanceException e = new BalanceException();
				 try {
					 throw e;
				  }
			
		catch(BalanceException e1) {
			System.out.println(e.getMessage());
		
		} 
			}}}
		
		
		
	
