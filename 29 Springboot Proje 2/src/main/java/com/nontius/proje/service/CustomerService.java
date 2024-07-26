package com.nontius.proje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.model.Customer;
import com.nontius.proje.repository.CustomerRepository;

import exception.CustomerNotFoundException;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer findById(String id) {
		
		return customerRepository.findById(id).orElseThrow(
				() -> new CustomerNotFoundException("Customer couldnt not find by id: " + id)
				);
	}
}
