package com.nontius.proje.serviceImpl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

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
import com.nontius.proje.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Component
public class AccountDetailsUserServiceImp implements UserDetailsService {

    private final AccountRepository repository;
    private final PasswordEncoder passwordEncoder;
    
    public AccountDetailsUserServiceImp(AccountRepository repository, PasswordEncoder passwordEncoder) {
    	
    	this.repository = repository;
    	this.passwordEncoder = passwordEncoder;
    	
    }
    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Account> accountOptional = repository.findByUsername(username);
        UserBuilder accountBuilder;

        if (accountOptional.isPresent()) {
            Account account = accountOptional.get();
            Collection<GrantedAuthority> authorities = account.getRoles().stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                    .collect(Collectors.toList());
            for(var s : authorities) {
            	System.err.println(s);
            }
           
            accountBuilder = User.withUsername(username);
            accountBuilder.password(passwordEncoder.encode(account.getPassword())) 
                    .authorities(authorities);
                  
                   
        } else {
            throw new UsernameNotFoundException("Account not found");
        }
        
        return accountBuilder.build();
    }
}
