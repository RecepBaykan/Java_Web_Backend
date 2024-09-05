package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nontius.proje.entityDTO.AccountDTO;
import com.nontius.proje.entityDTO.Login;


public interface AccountService {

	List<AccountDTO> getAccounts();
	
	AccountDTO getAccount(Long id);
	
	AccountDTO createAccount(AccountDTO accountDTO);
	
	public void delete(Long id);
	
	public AccountDTO update(Long id, AccountDTO accountDTO);
	
	public Login signin(Login login);
	
	AccountDTO getAccountDTO(String username);
	
	
	
	
}
