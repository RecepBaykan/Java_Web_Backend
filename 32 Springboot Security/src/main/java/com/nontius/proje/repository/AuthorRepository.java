package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

}
