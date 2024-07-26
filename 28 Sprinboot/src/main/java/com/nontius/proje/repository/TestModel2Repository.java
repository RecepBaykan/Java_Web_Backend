package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.TestModel2;

@Repository
public interface TestModel2Repository extends JpaRepository<TestModel2, Integer> {

}
