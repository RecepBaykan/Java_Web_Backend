package com.nontius.proje.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.model.TestModel;
import com.nontius.proje.repository.TestModelRepository;

@Service

public class TestModelService {


	@Autowired
	private TestModelRepository testModelRepository;




	public void save(TestModel testModel) {
		
		testModelRepository.save(testModel);
	}
}
