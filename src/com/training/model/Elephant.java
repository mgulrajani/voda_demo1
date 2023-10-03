package com.training.model;
//if you want to prevent further inheritance ,use final keyword
public  class Elephant extends Mammal {

	
	//if final is used with method ,then we cannot override the method in the child class
	@Override
	public final void eat() {
		// TODO Auto-generated method stub
		System.out.println("Elephant loves to eat grass ");
	}

	@Override
	public void prey() {
		// TODO Auto-generated method stub
		System.out.println("Elephants are peace loving ,not preying  or carnivores");
	}

	public void listeningToMahaut() {
		System.out.println("Elephants get trained by Mahauts");
	}
}
