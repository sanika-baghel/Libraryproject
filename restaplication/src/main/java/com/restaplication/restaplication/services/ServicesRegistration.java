package com.restaplication.restaplication.services;

import java.util.List;

import com.restaplication.restaplication.Entities.Registration;

public interface ServicesRegistration {
	public List<Registration> getRegistration();
	public Registration addregistration(Registration registration);
}
