package com.restaplication.restaplication.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaplication.restaplication.Entities.Books;
import com.restaplication.restaplication.repositories.BookRepository;

@Service("ServiceBooks")
public class ServiceBooksImp implements ServiceBooks {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Books> getBooks() {
		return (List<Books>) this.bookRepository.findAll();

	}

	public Books getBooksById(int bookid) {
		Books book = null;
		try {
			book = this.bookRepository.findById(bookid);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public Books addbook(Books book) {
		Books result = bookRepository.save(book);
		return result;
	}

	public void deletebook(int booksid) {
		bookRepository.deleteById(booksid);
	}

	// update user
	public void updatebook(Books book, int book_id) {
		book.setBookid(book_id);
		bookRepository.save(book);
	}

}
