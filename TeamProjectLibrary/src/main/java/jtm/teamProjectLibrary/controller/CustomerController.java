package jtm.teamProjectLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import jtm.teamProjectLibrary.model.Customer;
import jtm.teamProjectLibrary.service.CustomerService;

@Controller
public class CustomerController {

	public CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
		
	}
	
	@GetMapping("/customers")
	public String findAll (Model model) {
		List <Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		return "customer-list";
		
	}
	
	@GetMapping("/customer-add")
	public String createCustomerForm(Customer customer) {
		return "customer-add";
	}

	@PostMapping("/customer-add")
	public String createCustomer(Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	

}
