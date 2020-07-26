package jtm.teamProjectLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtm.teamProjectLibrary.model.Customer;
import jtm.teamProjectLibrary.repository.CustomerRepository;

@Service
public class CustomerService {

	
	private final CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer findById (int id) {
		return customerRepository.getOne(id);
	}
}
