package com.nontius.proje.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.dto.CreateAccountRequest;
import com.nontius.proje.model.Account;
import com.nontius.proje.model.Customer;
import com.nontius.proje.repository.AccountRepository;

@Service
public class AccountService {
	
	

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private CustomerService customerService;
	
	public void createAccount(CreateAccountRequest createAccountRequest) {
		
		Customer customer = customerService.findById(createAccountRequest.getId());
		
		Account account = new Account();
		
		account.setBalance(createAccountRequest.getInitialCredit());
		account.setCreateDate(new Date());
		account.setCustomer(customer);
		
		
		accountRepository.save(account);
	
	}
	
}
