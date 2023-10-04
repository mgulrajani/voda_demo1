package com.training.services;
@FunctionalInterface

//you just declare your methods , no definition
public interface Closeable {
void close();

default void m1() {
	
	System.out.println("this is m1 from Closeable interface");
}

static void m2() {
	System.out.println("this is a static method of Closeable");
}
}
