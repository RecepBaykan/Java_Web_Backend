package com.nontius.proje.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AccountUserDetails implements UserDetails {
	
	private String username;
	private String password;
	
	private List<GrantedAuthority> authorities;
	
	public AccountUserDetails(Account account) {
		username = account.getUsername();
		password = account.getPassword();
		authorities = account.getRoles().stream()
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
