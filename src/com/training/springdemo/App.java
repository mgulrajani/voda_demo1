package com.training.springdemo;

public class App {
	public static void main(String[] args) {
		//tight coupling
		//huge dependencies
		
		Engine engine=new Engine(2,4);
		Car c1 =new Car(111,"Maruti","Dzire",1200000,engine);
		
		//spring framework 
		
		//it is also IOC =container , which Inversion of Control
		//we dont have to look for the object 
		//container will provide on its own
		
		//we have to provide configuration/metadata 
		//xml or annotation
		
		//AOP
		//Security
		//WEB
		//Data 
		
		
	}

}
