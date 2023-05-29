package com.restaplication.restaplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaplication.restaplication.Entities.Books;
//import com.restaplication.restaplication.Entities.Course;
import com.restaplication.restaplication.Entities.Registration;
import com.restaplication.restaplication.services.ServiceBooks;
import com.restaplication.restaplication.services.ServicesRegistration;

@RestController
public class MyController {
	@Autowired
	private ServicesRegistration servicesRegistration;
	@Autowired
	private ServiceBooks serviceBooks;

	@GetMapping("/home")
	public String home() {
		return "This is home page now looking";
	}

	@GetMapping("/getregistration")
	public List<Registration> getregistration() {
		return this.servicesRegistration.getRegistration();

	}

	@RequestMapping(value = "/addregistration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Registration addregistration(@RequestBody Registration registration) {
		return this.servicesRegistration.addregistration(registration);
	}
	
	@GetMapping("/getbook")
	public List<Books> getbook(){
		return this.serviceBooks.getBooks();
	}
	
	@RequestMapping(value = "/addbook", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Books addbook(@RequestBody Books book) {
		return this.serviceBooks.addbook(book);
	}
}
