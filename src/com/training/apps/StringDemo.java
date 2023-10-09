package com.training.apps;

public class StringDemo {

	public static void main(String[] args) {
		String s = "hello";
		
		System.out.println(s);
		
		String s1=s;
		String s2=s1;
		String s3=new String("hello");
		String s4=s3;
		
		if(s3==s4) {
			System.out.println("same objects");
		}
		if(s3.equals(s)) {
			System.out.println("s3 and s are having equal contents");
		}
		
		if(s1==s2) {
			System.out.println("s1 and s2 are pointing to same String object");
			
		}
		else {
			
			System.out.println("s1 and s2 are referencing diff objects on heap");
		}
		
		
		
		if(s1==s3) {
			System.out.println("s1 and s3 are pointing to same String object");
			
		}
		else {
			
			System.out.println("s1 and s3 are referencing diff objects on heap");
		}
		
		/**
		 * Strings are immutable 
		 * 
		 * 
		 */
		
	}
}
