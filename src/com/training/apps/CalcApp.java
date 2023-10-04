package com.training.apps;

import com.training.services.ModernCalculator;
import com.training.services.Openable;

public class CalcApp {
	public static void main(String[] args) {
		//can i instantiate an interface with new operator
		//annonymous implementation
		//becuase I have not created any class which is implementing
		
		Openable o =new Openable() {

			@Override
			public void open() {
				System.out.println("open method implemented anonymously");
				
			}};
			//lambda , instead of using anonymous class
			
			 Openable o1=()->System.out.println("hello there , this is opened ");
			o1.open();
			
		//baseclass ref and we created the object of child class
		//Shop is Openable
		//Why Shop is Openable , because it implements Openable interface
		//I cant say Tower is Openable , becuase it has not implemented Openable Interface
		
		//Casio is ModernCalculator
		//becuase it is implementing ModernCalculator interface
		//coding to abstraction
		//ModernCalculator is interface it is abstract
		//reference of abstract interface 
		//you dont get bound to the implementation class
		Samsung s1=new Samsung();
		LG l1=new LG();
		ModernCalculator []arr = {s1,l1 };
		for(ModernCalculator c:arr) {
			
			c.add(3, 4);
			c.subtract(3, 4);
			c.modulus(3, 5);
			
			if(c instanceof Samsung) {
				Samsung s=(Samsung)c;
				//multiply is specific to Samsung class  , not in the  ModernCalculator
				s.multiply();
			}
			else if (c instanceof LG) {
				
				LG lg = (LG)c;
				lg.bigTV();
			}
			
		}
		
	}

}
