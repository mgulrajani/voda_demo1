package com.training.model;

import com.training.services.Closeable;
import com.training.services.Openable;

class Anatomy{}
//Eyes is Openable , Closeable

class Eyes extends Anatomy implements Openable , Closeable{

	@Override
	public void close() {
		System.out.println("Close your eyes for a while to rest");
	}

	@Override
	public void open() {
		System.out.println("open your eyes to see the beautiful world!");
	}}
class Hair extends Anatomy{}
class Mouth extends Anatomy implements Openable{

	@Override
	public void open() {
	System.out.println("to speak kind words");
	}}
public class Ears  extends Anatomy{

}
//interface Sim - data( ) calling( )
//classes which will implement this Sim interface -Vodafone Jio Airtel
//create an array of Sim and call the methods data and calling
//in Vodafone  -- coding() , Jio  -- fiveG()  Airtel -- goodReach() 



