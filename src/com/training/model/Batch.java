package com.training.model;

import java.time.LocalDate;

public class Batch {
	private int id;
	private String title;
	private LocalDate startDate;
	private LocalDate endDate;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	public Batch(int id, String title, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(int id, String title, LocalDate startDate) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate=this.startDate.plusMonths(2);
		
	}
	
	
	
	//getters and setters
	public static void main(String[] args) {
		Batch b1 = new Batch(1212,"Java FS",LocalDate.of(2023, 10, 3));
		System.out.println(b1);
		
		
	}
	

}
