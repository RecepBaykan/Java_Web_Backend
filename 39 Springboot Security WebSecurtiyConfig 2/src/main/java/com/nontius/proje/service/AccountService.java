package com.nontius.proje.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nontius.proje.entityDTO.AccountDTO;


public interface AccountService {

	List<AccountDTO> getAccounts();
	
	AccountDTO getAccount(Long id);
	
	AccountDTO createAccount(AccountDTO accountDTO);
	
	
	
	
}
