package com.nontius.proje.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.entityDTO.AgentDTO;
import com.nontius.proje.service.AgentService;

@RestController
@RequestMapping("/api/agent")
@CrossOrigin("*")
public class AgentController {
	

		private final AgentService service;
		public AgentController(AgentService service) {
			
			this.service = service;
		}
		
		
		@GetMapping("{id}")
		public ResponseEntity<?> getAgent(@PathVariable("id") Long id) {
			
			
			AgentDTO agentDTO = service.getAgent(id);
			
			if(agentDTO != null) {
				
				return ResponseEntity.ok(agentDTO);
			}else {
				
				return new ResponseEntity<>
				( "Not found content by id: "+ id, HttpStatus.NOT_FOUND);
			}
			
		}
		
		@PostMapping
		public ResponseEntity<?> createContent(@RequestBody AgentDTO dto){
			
			AgentDTO agent = service.createAgent(dto);
			
			if(agent != null) {
				
				return ResponseEntity.ok(agent);
			}else {
				return new ResponseEntity<>("Not crate content", HttpStatus.BAD_REQUEST);
			}
			
			
		}
		
		@GetMapping
		public ResponseEntity<?> getContents(){
			
			List<AgentDTO> dtoList = service.getAll();
			
			if(dtoList != null) {
				return ResponseEntity.ok(dtoList);
			}else {
				return new ResponseEntity<>
				( "Conttens Not Found", HttpStatus.NOT_FOUND);
			}
			
			
		}
		
		
		
		@PutMapping("{id}")
		public ResponseEntity<?> updateAgent(@PathVariable("id") Long id, 
				@RequestBody AgentDTO agentDTO){
			
			AgentDTO agent = service.updateAgent(id, agentDTO);
			
			if(agent != null) {
				return ResponseEntity.ok(agent);
			}else {
				return new ResponseEntity<>
				( "Conttens Not Found", HttpStatus.NOT_FOUND);
			}
		}
		
		@DeleteMapping("{id}")
		public void deleteContent(@PathVariable("id") Long id) {
			
			service.delete(id);
		
		}
		
		
	
			
		
	


}
