package com.nontius.proje.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.nontius.proje.entityDTO.AccountDTO;
import com.nontius.proje.entityDTO.AgentDTO;
import com.nontius.proje.entityDTO.Login;
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
	public ResponseEntity<?> getAccounts() {

		List<AccountDTO> accounts = service.getAccounts();

		return ResponseEntity.ok(accounts);
	}

	@PostMapping
	public ResponseEntity<?> createAccount(@RequestBody AccountDTO accountDTO) {

		AccountDTO account = service.createAccount(accountDTO);
		return ResponseEntity.ok(account);

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateAccount(@PathVariable("id") Long id, @RequestBody AccountDTO accountDTO) {

		AccountDTO account = service.update(id, accountDTO);
		return ResponseEntity.ok(account);

	}

	@DeleteMapping("/{id}")
	public void deleteAccoubt(@PathVariable("id") Long id) {

		service.delete(id);

	}

	@PostMapping("login")
	public Login signin(@RequestBody Login login) {

		return service.signin(login);
	}

	@GetMapping("/{username}")
	public ResponseEntity<?> getAccountUsername(@PathVariable("username") String username) {

		AccountDTO account = service.getAccountDTO(username);
		if (account != null) {

			return ResponseEntity.ok(account);
		} else {

			return new ResponseEntity<>("Not found content by id: " + username, HttpStatus.NOT_FOUND);
		}

	}

}
