package com.nontius.proje.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontius.proje.entity.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {
	 Optional<Account> findByUsername(String username);
}
