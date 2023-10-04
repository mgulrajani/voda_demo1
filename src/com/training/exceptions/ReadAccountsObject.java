package com.training.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.training.model.Account;

public class ReadAccountsObject {
	public static void main(String[] args) {
		
		try(FileInputStream fis =new FileInputStream("d:\\mkg\\accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Account a = (Account)ois.readObject();
			System.out.println(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
