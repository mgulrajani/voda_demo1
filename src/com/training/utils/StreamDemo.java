package com.training.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//not IOStream
//Stream API -java 1.8 
public class StreamDemo {
	public static void main(String[] args) {
		List<String> list=
				Arrays.asList("a1","a2","b1","b2","c1","c2");
		//creating a Stream object 
		//stream( ) method
		//upon the stream filter 
		//filter takes Predicate
		//test(arg) true /false
		
		list.stream()
		//intermediate methods of string
		.filter(s->s.startsWith("a"))
		.map(String::toUpperCase)
		//terminal method , terminating the stream
        .forEach(System.out::println);		
		
		
		
		Arrays.asList("heena","hema","avaya","tanaya")
		.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		Stream.of("java","oracle","c#","angular")
		.findAny()
		.ifPresent(System.out::println);
		
		IntStream.range(1, 8)
		.forEach(System.out::println);
		
		
		Arrays.stream(new int[] {3,4,5,6,7,8,9,11,22})
		.map(n->2*n+1)
		//.average()
		//.ifPresent(System.out::println);
		.forEach(System.out::println);
		
		
	}

}
