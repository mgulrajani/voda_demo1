package com.training.model;

public class Account {
	//instance variables 
	//why are they instance variables 
	//what is an instance ? object is an instance
	//if i create 2 Account objects -- then both the 
	//Account objects will have their own accountId and balance
	//Dristi and Ramani 
	private long accountId;
	private double balance;
	
	//overloaded constructors 
	/**
	 * 
	 * overloading 
	 *  overloaded functions
	 *  overloaded constructors
	 *  methods having same name with diff arguments
	 *  diff datatypes, diff sequence ,diff number of arguemtns
	 *  
	 *   eg :add(int,int,int)
	 *   add(int,int)
	 *   add(intarr)
	 *   
	 *
	 * */
	
	//what is constructor overloaded
	
	public Account() {
		System.out.println("Account object initialised");
	}
	
	public Account(Account a) {
		
		this.accountId=a.getAccountId();
		this.balance=a.getBalance();
		
		
	}
	public Account(long id,double bal) {
		
		this.accountId =id;
		this.balance=bal;
		
	}
	public Account(long id) {
		
		this.accountId=id;
		this.balance =1000;
		
	}
   
	/**
	 * integral datatypes - byte short int long 
	 * float double
	 * char
	 * boolean
	 * write methods which get and set accountId 
	 * and balance
	 * they are called accessors and mutators
	 * 
	 * 
	 */
	
	//instance methods
	
	/**
	 * what is the syntax for methods /behavior 
	 * 
	 * public static void main(String []args){ } 
	 * <accessspecifier> <modifier is optional> <return data type> <methodname>(parameters1 ,2, ){ 
	 *  logic
	 * }
	 * 
	 * public static void greeting(){ }
	 * 
	 * Account.greeting() 
	 * 
	 * below is the instance method
	 * not static
	 * return type is long
	 * 
	 * public long getBalance() { return balance;}
	 */

	//drishti.getBalance( )  ramani.getBalance( )
	public double getBalance() {
		return this.balance;
		
	}
	
	public long getAccountId() {
		
		return this.accountId;
	}
	
	//setters 
	
	public void setBalance(double balance ) {
		this.balance=balance;
		
	}
	
	public void setAccountId(long id) {
		
		this.accountId=id;
		
	}
	
	//deposit
	public double deposit(double amt) {
		this.balance= this.balance+amt;
		return this.balance;
	}
	
	public double withdrawl(double amtToBeWithdrawn) {
		
		if(this.balance < amtToBeWithdrawn) {
			//you will throw exception
			System.out.println("withdrawl not possible  ,not enough funds");
		}
		else {
			this.balance-=amtToBeWithdrawn;
			
			
		}
		return this.balance;
	}
  
	//we are overriding the default toString( ) provided by java.lang.Object which print the string form of the object as a fully qualified classname and hashcode
	
	//this method will be automatically called once you use system.out.println(accountobject)
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + "]";
	}
	
	
	
}

