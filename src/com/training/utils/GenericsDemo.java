package com.training.utils;

public class GenericsDemo<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenericsDemo(T t) {
		super();
		this.t = t;
	}

	public GenericsDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GenericsDemo [t=" + t + "]";
	}
	
	

}
