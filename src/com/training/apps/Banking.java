package com.training.apps;

import com.training.model.Account;

public class Banking {
	public static void main(String[] args) {
		
		Account drishti =new Account();
		drishti.setAccountId(423432432);
		drishti.setBalance(100000);
		
		Account ramani =new Account();
		ramani.setAccountId(232323);
		ramani.setBalance(200000);
		
		drishti.deposit(100000);
		System.out.println(drishti.getBalance());
		
		
	}

}
