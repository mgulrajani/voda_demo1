package com.training.model;

public class Book {

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
	
	
	//we cant say author extends book
	//id title dateofrelease --are these useful to Author class 
	//id name email 
	
}
