package com.nontius.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import lombok.RequiredArgsConstructor;

@EnableWebSecurity
@Configuration
public class AccountSecurityConfig {

    private final AccountAuthenticationProvider accountAuthenticationProvider;
    
    public AccountSecurityConfig(AccountAuthenticationProvider accountAuthenticationProvider) {
    	this.accountAuthenticationProvider = accountAuthenticationProvider;
    }

    @Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	
		 http.csrf().disable()
         .authorizeHttpRequests(authorize -> authorize
             .requestMatchers(HttpMethod.GET, "/api/agent/**").permitAll()
             .requestMatchers(HttpMethod.GET, "/api/event/**").permitAll()
             .requestMatchers(HttpMethod.GET, "/api/map/**").permitAll()
             .requestMatchers(HttpMethod.GET, "/api/news/**").permitAll()
             .requestMatchers(HttpMethod.GET, "/api/patch/**").permitAll()
             .requestMatchers(HttpMethod.GET, "/api/weapon/**").permitAll()// GET isteklerine izin ver
             .requestMatchers("/api/**").hasRole("ADMIN")  // Diğer /api/** isteklerinde ADMIN rolü gerektirir
             .anyRequest().authenticated()  // Diğer tüm istekler doğrulanmalıdır
         )
         .httpBasic()  // HTTP Basic Authentication kullan
         .and()
         .authenticationProvider(accountAuthenticationProvider);  // Özel AuthenticationProvider

      return http.build();
	}
    
    
    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
