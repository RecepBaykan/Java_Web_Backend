package com.nontius.proje.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.dto.StudentName;
import com.nontius.proje.dto.StudentNameSurname;
import com.nontius.proje.exception.StudentNotFoundException;
import com.nontius.proje.model.Student;
import com.nontius.proje.repository.StudentRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	protected Student findStudentById(String id) {
		
		
		return studentRepository.findById(id).orElseThrow(
				
				() -> new StudentNotFoundException("Student not found by ID. This ID: " + id)
				
				);
		
		
	}
	
	public List<StudentName> getNames(String name) {
		
		List<Student> students = studentRepository.findAll();
		List<StudentName> studentNames = new ArrayList<StudentName>();
		
		for(Student student : students) {
			System.out.println(student.getName());
			if(student.getName().toLowerCase().equals(name.toLowerCase())) {
				StudentName studentName = new StudentName(name);
				studentNames.add(studentName);
				System.out.println("Buldu");
			}
		}
		
		return studentNames;
		
	}
	
	public Student saveStudent(StudentNameSurname studentNameSurname) {
		
		
		Student student = new Student();
		student.setName(studentNameSurname.getName());
		student.setSurname(studentNameSurname.getSurname());
			
		studentRepository.save(student);
		
		return student;
		
		
	}

	
	
	public List<StudentNameSurname> getNames(){
		
		List<StudentNameSurname> getNameList = new ArrayList<StudentNameSurname>();
		
		return studentRepository.findAll().stream().map(
				student -> new StudentNameSurname(student.getName(), student.getSurname())
				
				).toList();

	/*
		for(Student student: studentRepository.findAll()) {
			
			getNameList.add(new StudentNameSurname(student.getName(), student.getSurname()));
		}
		
		
	*/
		
	
		
	}
	

}
