package com.nontius.proje.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.entity.Account;

import com.nontius.proje.entityDTO.AccountDTO;
import com.nontius.proje.exception.AccountNotFound;
import com.nontius.proje.mapper.AccountMapper;
import com.nontius.proje.repository.AccountRepository;
import com.nontius.proje.service.AccountService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	private final AccountRepository repository;
	
	

	@Override
	public AccountDTO createAccount(AccountDTO accountDTO) {
		// TODO Auto-generated  stub
		Account account = AccountMapper.AccountDTOToAccount(accountDTO);
		Account savedAccount = repository.save(account);
		
		return AccountMapper.AccountToAccountDTO(savedAccount);
	}

	@Override
	public AccountDTO getAccount(Long id) {
		
		Account account = repository.findById(id)
				.orElseThrow(() -> new AccountNotFound("Account not found by id:" + id));
		
		return AccountMapper.AccountToAccountDTO(account);
	}

	@Override
	public List<AccountDTO> getAccounts() {
		
		List<Account> accounts = repository.findAll();
		return accounts.stream().map(
				(account) -> AccountMapper.AccountToAccountDTO(account)
				).collect(Collectors.toList());
				
	}


}
