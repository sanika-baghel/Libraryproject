package com.restaplication.restaplication.repositories;


import org.springframework.data.repository.CrudRepository;

import com.restaplication.restaplication.Entities.*;

public interface BookRepository extends CrudRepository<Books, Integer>{
	public Books findById(int bookid);
}
