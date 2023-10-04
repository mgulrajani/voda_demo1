package com.training.services;
//ModernCalculator is extension of Calculator
public interface ModernCalculator extends Calculator{
  double modulus(double a,double b);
}

class Acer implements Calculator{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}}

class Casio implements ModernCalculator{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double modulus(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
