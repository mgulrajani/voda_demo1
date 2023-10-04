package com.training.apps;

import com.training.model.Account;
import com.training.utils.GenericsDemo;

public class GenDemo {
	public static void main(String[] args) {
		
		GenericsDemo<String> strData = new GenericsDemo<String>("hello there");
		
		GenericsDemo<Integer> intValue = new GenericsDemo<Integer>(12121);
		
		System.out.println(strData.getT());
		System.out.println(intValue.getT());
		
		GenericsDemo<Account> genAcc = new GenericsDemo<>(new Account(232323,32434));
		System.out.println(genAcc.getT());
	}

}
