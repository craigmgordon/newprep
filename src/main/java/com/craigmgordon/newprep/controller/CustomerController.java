package com.craigmgordon.newprep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.craigmgordon.newprep.model.Customer;
import com.craigmgordon.newprep.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;

	@RequestMapping(value = "/customers")
	public String getAllCustomers(Model model) {
		List<Customer> customers = service.findAll();
		model.addAttribute("customers", customers);

		return "customerList";
	}

	@RequestMapping(value = "/addCustomer")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {

		// TODO blank record is being saved as well as new record
		Customer newCustomer = service.save(customer);

		System.out.println("customer forename: " + newCustomer.getForeame());
		System.out.println("customer surname: " + newCustomer.getSurname());
		System.out.println("customer ref: " + newCustomer.getCustomerRef());
		return "addCustomer";
	}

}
