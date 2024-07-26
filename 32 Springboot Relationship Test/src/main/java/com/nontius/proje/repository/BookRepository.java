package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
