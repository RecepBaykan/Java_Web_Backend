package com.nontius.proje.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> {

}
