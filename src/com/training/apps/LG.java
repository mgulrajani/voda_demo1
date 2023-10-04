package com.training.apps;

import com.training.services.ModernCalculator;

public class LG implements ModernCalculator {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("LG add");
		return 0;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("LG subtract ");
		return 0;
	}

	@Override
	public double modulus(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("LG modulus  method implementation");
		return 0;
	}
	
	public void bigTV() {
		System.out.println("we are into TVs now");
	}

}
