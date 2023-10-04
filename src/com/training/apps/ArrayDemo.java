package com.training.apps;

import com.training.exceptions.LessFundsException;
import com.training.model.Account;
import com.training.model.CurrentAccount;
import com.training.model.Deer;
import com.training.model.Elephant;
import com.training.model.Lion;
import com.training.model.Mammal;
import com.training.model.OffShoreAccount;

public class ArrayDemo {
	public static void main(String[] args) throws LessFundsException {
		//declared x as an int array with 10 values
		int []xArr= { 12,23,35,40,57,66,87,98,119,330};
		
		//for loop 2 parts  separated by :  first part initial decl data int x : after the colon,you give
		//the array which the loop will iterate and print the values
		
		//enhanced for loop
		for(int x:xArr) {
			System.out.print(x*2+"\t");
		}
		System.out.println();
		//traditional for loop
		for(int i=0;i<xArr.length;i++) {
			System.out.print(xArr[i]*2+"\t");
		}
		
		//declared that i want a array of 4 objects of Account 
		//any constructors are called  Account( ) ??
		Account []accountsArr =  new Account[4];
		//memory allocation 
		
		Account acc2=  new Account(343434,55656);
		acc2.deposit(10000);
		acc2.withdrawl(9000);
		
		Account acc3=acc2;
		
		Account dinu=new CurrentAccount(3224324, 1000000, 2000000);
		dinu.withdrawl(3000000);
		
		Account drishti = new OffShoreAccount(12341234, 320000, "Japan", "JP3434");
		
		accountsArr[0]=acc2;
		accountsArr[1]=acc3;
		accountsArr[2]=dinu;
		accountsArr[3]=drishti;
		
		for(Account ac:accountsArr) {
			ac.addInterest(4000);
		}
		
		
		Mammal m = new Elephant();
		Mammal d = new Deer();
		Mammal l =new Lion();
		
		Mammal []arr = {m,d,l};
		//it will iterate thru the mammal arr
		//at the zeroth index 
		for(int i=0;i<arr.length;i++) {
			arr[i].prey();
		}
	}

}
