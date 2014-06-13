package com.craigmgordon.newprep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
