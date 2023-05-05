package com.bookStore.entity;

//import javax.persistence.Entity;
//import javax.persistence.GenerationType;
//import javax.persistence.*;

//@Entity
public class Book {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCatagory;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCatagory() {
		return bookCatagory;
	}
	public void setBookCatagory(String bookCatagory) {
		this.bookCatagory = bookCatagory;
	}
	
	
		
}
