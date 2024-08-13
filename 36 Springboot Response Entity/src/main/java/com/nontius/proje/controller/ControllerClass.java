package com.nontius.proje.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/control")
@CrossOrigin("*")
public class ControllerClass {

	// ResponseEntity
	
	@GetMapping("{message}")
	public ResponseEntity<String> getMessage(@PathVariable("message") String message){
		
		
		return new ResponseEntity<>("Your message is recived. "
				+ "Your message:\n" + message, HttpStatus.OK);
		
	}
	
	
	@GetMapping("error/{message}")
	public ResponseEntity<String> getMessageWithErros(@PathVariable("message") String message){
		
		
		return new ResponseEntity<>("YourMessage is recived."
				+ "Your Message:\n" + message, HttpStatus.SEE_OTHER);
		
	}
	
	@PostMapping
	public ResponseEntity<Person> createClass(@RequestBody Person person){
		
		Person p = person;
		
		return ResponseEntity.ok(p);
		
	}
	
	
	

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person{
	private String name;
	private String surname;
}
