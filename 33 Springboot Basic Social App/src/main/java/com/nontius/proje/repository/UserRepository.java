package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.nontius.proje.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	
	User findByUsername(String username);
}
