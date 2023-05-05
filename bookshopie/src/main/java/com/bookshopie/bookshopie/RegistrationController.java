package com.bookshopie.bookshopie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@PostMapping("/addRegistration")
	public String addRegistration(Registration registration) {

		String insertQuery = "insert into registration"
		                   + "(userName,userPassword)" 
				           + "values"
		                   + "(?,?)";
		int rows = jdbcTemplate.update(insertQuery, registration.getUserName(), registration.getUserPassword());
		if (rows == 1) {
			return "success";
		} 
		//else {
			return " ";
		//}
	}

}
