package com.training.model;

public class Book implements Comparable<Book>{

	private int id;
	private String title;
	//Book has a Author 
	private Author author;
	private Genre genre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Book(int id, String title, Author author, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}
	public Book(int id, String title, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Book o) {
		if(this.id==o.id)
			return 0;
		else if(this.id > o.id )
			return 1;
		else
			return -1;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + "]";
	}
	
	
	//we cant say author extends book
	//id title dateofrelease --are these useful to Author class 
	//id name email 
	
}
