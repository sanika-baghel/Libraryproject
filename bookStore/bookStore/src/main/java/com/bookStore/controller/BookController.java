package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookStore.entity.UserLoginForm;
import com.bookStore.entity.UserRegistration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;
@Controller
public class BookController {

	@GetMapping("/")
	public String home() {
		return "home";

	}
	
	@RequestMapping(value="/userRegistration", method=RequestMethod.GET)
	public String userRegistration() {
		return "userRegistration";

	}

	@GetMapping("/userLogin")
	public String userLogin() {
		return "userLogin";

	}
	@GetMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";

	}
	@GetMapping("/contactus")
	public String contactUs() {
		return "contactUs";
					
	}

	/*@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") UserLoginForm loginForm, Model model) {
		String username=loginForm.getUserName();
		String userpassword=loginForm.getUserPassword();
		
		if("admin".equals(username) && "admin".equals(userpassword))
		{
			return "userPage";
		}
		return "";
		
	}*/

	@PostMapping("/userRegistration")
	public String processRegister(UserRegistration registration) {
	    
	   // userRepo.save(registration);
	     
	    return "userRegistration";
	    }
	
}
