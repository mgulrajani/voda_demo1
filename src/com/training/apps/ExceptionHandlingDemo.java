package com.training.apps;
/**
 * 
 * 
 * unchecked exceptions --are not checked by the compiler
 * x=100/0  , is the compiler checking 
 * checked exceptions - compiler will force you to do either  a)  declare (throw and throws) 
 * or b) handle -try catch finally
 * FileIO  ,jdbc 
 *  */
public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {//regular logic
		String s="hello";
		
		int x=5/2;
		System.out.println(x);
		System.out.println(s.length());
		
		int []arr= {2,3,4,5};
		int y=100;
		for (int i=0;i<arr.length;i++) {
			System.out.println(y/arr[i]);
		}
		}
		catch(ArithmeticException ae) {
			System.out.println("Any number cannot be divided by zero");
		}
		catch(NullPointerException npe) {
			System.out.println("Null objects cannot call any method");
		}
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("Array index out of bounds");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			//close up files ,network ,jdbc  free up mem space
			System.out.println("some other data is to be worked upon ");
			
		}
		
	}

}
