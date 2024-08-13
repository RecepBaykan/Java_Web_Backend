package com.nontius.proje.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.nontius.proje.entityDTO.AccountDTO;
import com.nontius.proje.service.AccountService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/api/account")
@CrossOrigin("*")
public class AccountController {
	
	private final AccountService service;
	
	@GetMapping
	public ResponseEntity<?> getAccounts(){
		
		List<AccountDTO> accounts = service.getAccounts();
		
		return ResponseEntity.ok(accounts);
	}
	
	@PostMapping
	public ResponseEntity<?> createAccount(@RequestBody AccountDTO accountDTO){
		
		AccountDTO account = service.createAccount(accountDTO);
		return ResponseEntity.ok(account);
		
	}

}
