package com.nontius.proje.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.dto.StudentNameSurname;
import com.nontius.proje.model.Student;
import com.nontius.proje.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("student")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/info")
	public String info() {
		
		return "Student Controller Info";
	}
	
	
	
	@GetMapping("/all")
	public List<Student> getAll(){
		
		return studentService.getStudentRepository().findAll();
	}
	
	
	// Öğrenci sorgulama
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody StudentNameSurname studentNameSurname) {
			
		
		Student student = studentService.saveStudent(studentNameSurname);
		
		
	
		
		return "işlendi";
		
	}
	
	
	@GetMapping() //Ada göre bulma olabilir
	public List stundetName(@RequestParam("name") String name) {
		
		System.out.println(name);
		return studentService.getNames(name);
		
	}
	
	

	
	
}
