package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	

}
