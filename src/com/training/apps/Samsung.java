package com.training.apps;

import com.training.services.ModernCalculator;

public class Samsung implements ModernCalculator {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("samsung add");
		return 0;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("samsung subtract");
		return 0;
	}

	@Override
	public double modulus(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("samsung modulus");
		return 0;
	}
	
	public void multiply() {
		System.out.println("in progress");
	}

}
