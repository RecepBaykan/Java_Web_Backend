package com.nontius.proje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.model.Message;
import com.nontius.proje.repository.MessageRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageService {
	
	@Autowired
	private MessageRepository repository;
	
	public void save(Message message) {
		
		repository.save(message);
		
	}
	

}
