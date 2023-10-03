package com.training.model;

public class CurrentAccount extends Account {
	
	private double overdraftAmtLimit;

	public CurrentAccount(long id, double bal,double odlimit) {
		super(id, bal);
		this.overdraftAmtLimit=odlimit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentAccount "+super.toString()+"[overdraftAmtLimit=" + overdraftAmtLimit + "]";
	}
	
	//constructor where in I can call super class constructor
	//to pass on account id and balance 
	
	//@Override actually checks whether you have given the correct signature or not
   @Override
   public double withdrawl(double amt) {
	   double balance=0;
	 if ( amt <= this.overdraftAmtLimit +this.getBalance())
	 {
		 System.out.println("seems like you can withdraw");
		 balance = this.getBalance()-amt;
		 this.setBalance(balance);
	 }
	 else {
		 System.out.println("Error ,Less funds!!");
	 }
	 return balance;
	 
   }

}
