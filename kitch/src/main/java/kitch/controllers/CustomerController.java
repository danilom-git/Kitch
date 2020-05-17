package kitch.controllers;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kitch.model.Customer;

@RestController
public class CustomerController {
	
	private KieSession kieSession;
	
	@Autowired
	public CustomerController(KieSession kieSession) {
		this.kieSession = kieSession;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET, produces = "application/json")
	public Customer testCustomer() {
		Customer customer = new Customer("temp_customer", "123");
		kieSession.insert(customer);
		kieSession.fireAllRules();
		return customer;
	}
}
