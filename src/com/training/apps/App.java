package com.training.apps;

import com.training.model.Address;
import com.training.model.Student;

public class App {
public static void main(String[] args) {
	Address address1 = new Address("the Signature","mgm marg","Nashik","300560");
	Student s1 = new Student(111,"John","john@gmail.com",address1);
	
	//Student object has  a Address object
	//s1.setAddress(address1);
	System.out.println(s1.getAddress().getCity());
	//System is java.lang class
	//has a --
	
	
}
}
