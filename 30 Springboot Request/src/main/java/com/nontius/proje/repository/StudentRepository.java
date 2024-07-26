package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nontius.proje.model.Student;

public interface StudentRepository extends JpaRepository<Student, String>{


	
}
