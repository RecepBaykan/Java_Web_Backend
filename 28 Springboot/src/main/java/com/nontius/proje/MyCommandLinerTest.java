package com.nontius.proje;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nontius.proje.model.TestModel;
import com.nontius.proje.model.TestModel2;
import com.nontius.proje.service.TestModelService;

@Component
public class MyCommandLinerTest implements CommandLineRunner{

	private TestModelService testModelService = new TestModelService();
	
	@Autowired
	public MyCommandLinerTest(TestModelService testModelService) {
		this.testModelService = testModelService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		TestModel2 testModel21 = new TestModel2();
		
		testModel21.setName("1. Test Model 2");
		
		TestModel2 testModel22 = new TestModel2();
		
		testModel22.setName("2. Test Model 2");
		
		List<TestModel2> list = new ArrayList<TestModel2>();
		
		list.add(testModel22);
		list.add(testModel21);
		
		
		TestModel testModel = new TestModel();
		
		testModel.setName("Test Model");
		
		testModel.setTestModel2s(list);

		
		testModelService.save(testModel);

		
	}

}
