	package com.nontius.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.nontius.proje.serviceImpl.AccountDetailsUserServiceImp;

import lombok.AllArgsConstructor;


@Component
public class AccountAuthenticationProvider implements AuthenticationProvider {

	private final UserDetailsService userDetailsService;
	private final PasswordEncoder passwordEncoder;

	public AccountAuthenticationProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
			
		this.userDetailsService = userDetailsService;
		this.passwordEncoder = passwordEncoder;
	}

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            // Şifreyi doğrula
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("Invalid password");
            }

            return new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());

        } catch (UsernameNotFoundException e) {
            throw new BadCredentialsException("Account Not Found");
        }
    }

	@Override
	public boolean supports(Class<?> authentication) {

		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
