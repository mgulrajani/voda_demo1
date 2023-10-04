package com.training.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.training.model.Account;

public class IOExceptionDemo {

	public static void main(String[] args) {
		Account acc1= new Account();
		acc1.setAccountId(2343242);
		acc1.setBalance(455435);
		
		//to write the object data to a file , we
		//have used ObjectOutputStream , it's constructor takes FileOutputStream 
		//FileOutputStream constructors -- String path of file name
		try(FileOutputStream fos=new FileOutputStream("d:\\mkg\\accounts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
		    
			oos.writeObject(acc1);
			System.out.println("object written on to the file");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
