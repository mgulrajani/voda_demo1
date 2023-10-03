package com.training.apps;

import java.util.Scanner;

import com.training.model.Deer;
import com.training.model.Elephant;
import com.training.model.Lion;
import com.training.model.Mammal;

public class Zoo {
public static void main(String[] args) {
	
	Mammal mammal = null;
	System.out.println("1.Elephant");
	System.out.println("2.Deer");
	System.out.println("3.Lion");
	int choice =0;
	System.out.println("Enter the animal number which is going to be fed ");

	Scanner scanner  = new Scanner(System.in);
	choice = scanner.nextInt();
	
	switch(choice) {
	
	case 1:
		//reference of parent class pointing to an object of child class is upcasting
		 mammal = new Elephant();
		 break;
	case 2:
		 mammal = new Deer();
		 break;
	case 3:
		mammal = new Lion();
		break;
	default:
		System.out.println("wrong choice!!");
	}
	
	feedMammal(mammal);
	
}
public static void feedMammal(Mammal m) {
	Elephant e = null;
	m.eat();
	m.prey();
	//can we say all Elephants are mammals , yes or no ?
	//Mammal m = new Elephant()
	//but can i say all mammals are elephants
	if(m instanceof Elephant) {
	 e =(Elephant) m;
	 e.listeningToMahaut();
	 
	
}
}}

