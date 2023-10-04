package com.training.apps;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.model.Account;
import com.training.services.Closeable;
/**
 * Functional interfaces are of 3 types
 * a .we create
 * b. prior to 1.8  -Runnable  threads 
 * c. with 1.8  - Consumer Function Producer Predicate
 * 
 *  
 *  */
public class LambdaDemo {
public static void main(String[] args) {
	
	Closeable c1 =( )->System.out.println("it is closed");
	
	Closeable c2 = ( )-> System.out.println("closed till renovation");


    c1.close();
    c2.close();
    A a1 =new A();
    a1.close();
    
    Closeable noLambda = new Closeable() {
		
		@Override
		public void close() {
			System.out.println("annonymously closed");
			
		}
	};
	
	noLambda.close();
	
	Runnable r1=()->{ for(int i=0;i<10;i+=2) {System.out.println(i);try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
};

Thread t1=new Thread(r1);
t1.start();




//
Predicate<Integer> p1=(val)->val%2==0;

isEven(p1, 1008);
isEven(p1,53);

//lambda syntax 

Supplier<String> s1=()->"hello world!";

System.out.println(getData(s1));

Supplier<Account> s2 =()->{
	return new Account();
} ;
Account newAccountObject  =  s2.get();
newAccountObject.setAccountId(223234);
newAccountObject.setBalance(190000);
System.out.println(newAccountObject);
//:: is for method referencing
//that there is a println method in the out object
Consumer<Integer> intConsumer=System.out::println;
consume(intConsumer,100);
Consumer<String> stringConsumer=(s)->System.out.println(s);

consumeString(stringConsumer,"Hello there");

Function<String,Integer> f1 = (s)->s.length();

int length=f1.apply("how are you?");
System.out.println(length);
}

private static void consumeString(Consumer<String> stringConsumer, String string) {
stringConsumer.accept(string);
}

public static void consume(Consumer c , int val) {
	c.accept(val);
	
}
public static String getData(Supplier s) {
	
	return (String)s.get();
}
public static void isEven(Predicate p,Integer i) {
	if(p.test(i)) {
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
}
}
class A implements Closeable{

	@Override
	public void close() {
		System.out.println("close implemented");
		
	}
	
}

//create a functional interface Math add method 2 args  
//create lambdas 2 - + and in another you double and add it

