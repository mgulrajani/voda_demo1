package com.training.apps;

import com.training.exceptions.LessFundsException;
import com.training.model.Account;
import com.training.model.CurrentAccount;
import com.training.model.OffShoreAccount;

public class Banking {
	public static void main(String[] args) {
		try {
		//Liskov's substitution principle
		//Parent class reference can point to child class object 
		//reference of parent class and object of child class - upcasting 
		//itis allowed
		//liskov's substitution principle
		//life cycle stages -instantiated  , service , no longer required
		Account acc2=  new Account(343434,55656);
		acc2.deposit(10000);
		acc2.withdrawl(100000);
		
		Account acc3=acc2;
		if(acc2==acc3) {
			System.out.println("both are pointing to same object");
		}
		acc2=null;
		System.out.println(acc3);
		if(acc2==acc3) {
			System.out.println("both are pointing to same object");
		}else
		{
			System.out.println("They are pointing to different object in heap");
		}
		acc3=null;
		System.gc();
		Account dinu=new CurrentAccount(3224324, 1000000, 2000000);
		dinu.withdrawl(3000000);
		
		Account drishti = new OffShoreAccount(12341234, 320000, "Japan", "JP3434");
		//Account drishti =new Account(454545,400000);
		
		
		/*
		 * drishti.setAccountId(423432432); drishti.setBalance(100000);
		 */
		/**
		 * 
		 * 
		 * what is a constructor ?
		 * Account() is provided by JVM
		 * default constructor is provided by JVM if incase you dont have any constructor
		 * 
		 */
		Account ramani =new Account(123232,500000);
		/*
		 * ramani.setAccountId(232323); ramani.setBalance(200000);
		 */
		drishti.deposit(100000);
		System.out.println(drishti.getBalance());
		
		System.out.println(drishti);
		
		Account kalyani = new Account(ramani);
		displayDetails(kalyani);
		displayDetails(ramani);
		displayDetails(drishti);
		displayDetails(dinu);
		System.out.println(ramani);
		
		}
		catch(LessFundsException lfe) {
			System.out.println(lfe.getMessage() + " "+lfe.getErrorCode());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void displayDetails(Account a) {
		
		if (a instanceof CurrentAccount) {
			System.out.println("it is a current account");
			
		}
		else if(a instanceof OffShoreAccount) {
			
			System.out.println("it is an offshore account");
			
		}else 
			System.out.println("it is a regular account");
		
	}

}
