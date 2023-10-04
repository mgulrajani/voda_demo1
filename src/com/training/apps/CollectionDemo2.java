package com.training.apps;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Book;
import com.training.model.BookTitleComparator;

public class CollectionDemo2 {
public static void main(String[] args) {
	
	Book b1=new Book(111,"tao of physics");
	
	Book b2 = new Book(232,"Ramayan -Hanuman");
	
	Book b3=new Book(5456,"On the shoulders of Giant");
	
	Book b4=new Book(3344,"God made Integers");
	
	Book b5=new Book(2233,"BG");
	List<Book> list=List.of(b1,b2,b3,b4,b5);
	Set<Book> set=new TreeSet<>(list);
	
	for(Book b:set) {
		System.out.println(b);
	}
	System.out.println("Comparator Title");
	Set<Book> set2 =  new TreeSet<>(new BookTitleComparator());
	set2.addAll(list);
	
	
	for(Book b:set2) {
		System.out.println(b);
	}
	
	System.out.println("Comparator using method reference");
	Comparator<Book> comparatorTitle=Comparator.comparing(Book::getTitle);
	Set<Book> set3 =  new TreeSet<>(comparatorTitle);
	set3.addAll(list);
	
	
	for(Book b:set3) {
		System.out.println(b);
	}
	
	System.out.println("Comparator using method reference");
	Comparator<Book> comparatorTitle2=(p1,p2)->p1.getTitle().compareTo(p2.getTitle());
	
	Set<Book> set4 =  new TreeSet<>(comparatorTitle2);
	set4.addAll(list);
	
	
	for(Book b:set4) {
		System.out.println(b);
	}
	
}
}
