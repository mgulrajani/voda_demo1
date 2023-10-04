package com.training.apps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	
	//List always maintains the insertion order
	//the way data is added is retained
	public static void main(String[] args) {
		Integer val=0;
		List<Integer> list1 =new ArrayList<>();
		list1.add(1212);
		list1.add(53453);
		list1.add(4545);
		list1.add(1, 100);
		list1.add(4566);
		Iterator iterator = list1.iterator();
		
		while(iterator.hasNext()) {
		val=	(Integer) iterator.next();
		System.out.println(val);
		}
		
		List<String> list2=List.of("heena","mitali","nirav","hema","aakash","saurav");
		
		System.out.println(list2);
		
		Set<Integer> set =  new HashSet<>();
		set.add(100);
		set.add(300);
		set.add(100);
		set.add(300);
		set.add(100);
		set.add(300);
		set.add(100);
		set.add(300);
		
		System.out.println(set);
		
	   set.addAll(list1);
	   System.out.println(set);
	   
	   Set<Integer> set2 = new TreeSet<>(set);
	   System.out.println(set2);
	   
	   
	   Set<String> set3=new TreeSet<>(list2);
	   
	   System.out.println(set3);
	   
	   Vector<Integer> v1=new Vector<>();
	   v1.addElement(2323);
	   v1.add(100);
	   
	   System.out.println(v1.get(1));
	   
	   
	   
	}

}
