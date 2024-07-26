package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.TestModel;

@Repository
public interface TestModelRepository extends JpaRepository<TestModel, Integer> {

}
