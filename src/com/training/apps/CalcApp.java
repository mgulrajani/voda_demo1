package com.training.apps;

import com.training.services.ModernCalculator;

public class CalcApp {
	public static void main(String[] args) {
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
