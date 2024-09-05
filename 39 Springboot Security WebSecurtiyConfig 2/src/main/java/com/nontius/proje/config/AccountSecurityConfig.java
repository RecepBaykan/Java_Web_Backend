package com.nontius.proje.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@Configuration
public class AccountSecurityConfig {

	
	private final AuthenticationProvider authenticationProvider;
	
	public AccountSecurityConfig(AuthenticationProvider authenticationProvider) {
		this.authenticationProvider = authenticationProvider;
	}
	

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       
		
		
		return http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/account/**")
                .hasRole("ADMIN")
                .and()
                .httpBasic()
                .and()
                //CustomAuthenticationProvider
                .authenticationProvider(authenticationProvider) 
                .build();
        
        
    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return  new BCryptPasswordEncoder();
	    }
}
