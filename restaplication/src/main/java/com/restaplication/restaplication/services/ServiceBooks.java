package com.restaplication.restaplication.services;

import java.util.List;

import com.restaplication.restaplication.Entities.Books;


public interface ServiceBooks {
	public List<Books> getBooks();
	public Books addbook(Books book);
}
