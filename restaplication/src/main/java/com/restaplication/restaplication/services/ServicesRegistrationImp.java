package com.restaplication.restaplication.services;

//import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaplication.restaplication.Entities.Registration;
import com.restaplication.restaplication.repositories.RegistrationRepository;

@Service
public class ServicesRegistrationImp implements ServicesRegistration {

	@Autowired
	private RegistrationRepository registrationRepository;

	// List<Registration> list;

	// public ServicesRegistrationImp() {
	// list = new ArrayList<>();
	// list.add(new Registration(101, "Nikita Kamble", "nikitk"));
	// list.add(new Registration(102, "Asawari Sarnobat", "asaki"));
	// list.add(new Registration(103, "Sanika Baghel", "sankjh"));
	// }

	@Override
	public List<Registration> getRegistration() {

		List<Registration> list = (List<Registration>) this.registrationRepository.findAll();
		return list;
	}

	public Registration getRegistrationById(int id) {
		Registration registration = null;
		try {
			registration = this.registrationRepository.findById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return registration;
	}

	// add user
	@Override
	public Registration addregistration(Registration registration) {
		Registration result = registrationRepository.save(registration);
		return result;
	}

	// delete user
	public void deleteregistration(int rid) {
		registrationRepository.deleteById(rid);
	}

	// update user
	public void updateregistration(Registration registration, int registration_id) {
		registration.setUserid(registration_id);
		registrationRepository.save(registration);
	}
}
