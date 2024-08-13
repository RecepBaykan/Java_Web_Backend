package com.nontius.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.nontius.proje.serviceImpl.AccountDetailsUserServiceImp;

import lombok.AllArgsConstructor;


@Component
public class AccountAuthenticationProvider implements AuthenticationProvider {

	private final AccountDetailsUserServiceImp accountDetailsUserServiceImp;

	public AccountAuthenticationProvider(@Lazy AccountDetailsUserServiceImp accountDetailsUserServiceImp) {
			
		this.accountDetailsUserServiceImp = accountDetailsUserServiceImp;
	}

	@Override
	public Authentication authenticate( Authentication authentication) throws AuthenticationException {

		// DB'den kullanıcıyı al
		
		

		try {

			UserDetails userdaDetails = accountDetailsUserServiceImp.loadUserByUsername(authentication.getName());
			
			return new UsernamePasswordAuthenticationToken(userdaDetails, userdaDetails.getPassword(),
			        userdaDetails.getAuthorities());

			

		} catch (UsernameNotFoundException e) {
			throw new BadCredentialsException("Account Not Found");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {

		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
