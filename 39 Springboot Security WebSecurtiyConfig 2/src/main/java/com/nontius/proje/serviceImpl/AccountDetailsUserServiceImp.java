package com.nontius.proje.serviceImpl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.nontius.proje.entity.Account;
import com.nontius.proje.entity.AccountUserDetails;
import com.nontius.proje.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Component
public class AccountDetailsUserServiceImp implements UserDetailsService {

	@Autowired
    private  AccountRepository repository;
   
 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
    	
    	Optional<Account> accountOptional = repository.findByUsername(username);
    	return accountOptional.map(AccountUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("Account not found"));
    }
}
