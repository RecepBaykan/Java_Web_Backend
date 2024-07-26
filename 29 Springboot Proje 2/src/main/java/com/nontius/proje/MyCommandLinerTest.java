package com.nontius.proje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nontius.proje.dto.CreateAccountRequest;
import com.nontius.proje.model.Account;
import com.nontius.proje.model.Customer;
import com.nontius.proje.model.Transaction;
import com.nontius.proje.model.TransactionType;
import com.nontius.proje.service.AccountService;
import com.nontius.proje.service.CustomerService;
import com.nontius.proje.service.TransactionService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyCommandLinerTest implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccountService accountService;

	
	
	

	@Override
	public void run(String... args) throws Exception {

		/*
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(40.0);
		transaction1.setTransactionType(TransactionType.INITIAL);
		transaction1.setTransactionDate(new Date());
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(40.0);
		transaction2.setTransactionType(TransactionType.INITIAL);
		transaction2.setTransactionDate(new Date());
		
		
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction1);
		transactions.add(transaction2);
		
		
		Account account1 = new Account();
		account1.setBalance(1000.40);
		account1.setCreateDate(new Date());
		account1.setTransactions(transactions);

		Account account2 = new Account();
		account2.setBalance(1421.50);
		account2.setCreateDate(new Date());
		account2.setTransactions(transactions);
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		
		
		Customer customer = new Customer();
		
		customer.setName("Recep");
		customer.setSurname("Baykan");
		customer.setAccounts(accounts);
		
		customerService.save(customer);
		*/
		
		CreateAccountRequest createAccountRequest = new CreateAccountRequest();
		
		createAccountRequest.setId(customerService.findById("1").getId());
		createAccountRequest.setInitialCredit(104.3);
		
		accountService.createAccount(createAccountRequest);

	}

}
