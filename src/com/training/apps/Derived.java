package com.training.apps;

class Test 
{ 
	void myMethod() 
	{ 
		System.out.println("Hello world"); 
	} 
} 
public class Derived extends Test 
{ 
	void myMethod() 
	{ 
		System.out.println("hw"); 
	} 
	
	public static void main(String[] args) 
	{ 
		Test object = new Derived(); 
		object.myMethod(); 
	} 
} 
