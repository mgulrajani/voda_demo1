package com.training.model;

import com.training.services.Closeable;
import com.training.services.Openable;

public class Shop extends Building implements Openable,Closeable{
	private boolean commercialProperty;
	
	public Shop(){
		this.commercialProperty=true;
		System.out.println("shop is initialised");
		
	}

	@Override
	public void close() {
		System.out.println("Shop was closed during Ganesh Utsav");
	}

	@Override
	public void open() {
	System.out.println("We are open!");
		
	}

}

class Tower extends Building{
	
	private int numberOfFloors;
	
	
}