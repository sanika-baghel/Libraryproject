package com.restaplication.restaplication.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookinfo")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	String booktitle;
	String bookauthor;
	String bookcatagory;

	

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookcatagory() {
		return bookcatagory;
	}

	public void setBookcatagory(String bookcatagory) {
		this.bookcatagory = bookcatagory;
	}

	public Books() {
		super();
		
	}

	public Books(int bookid, String booktitle, String bookauthor, String bookcatagory) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookcatagory = bookcatagory;
	}
	
	

}
