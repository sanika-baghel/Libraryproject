package com.restaplication.restaplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.restaplication.restaplication.Entities.*;

public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

	public Registration findById(int id);
}
