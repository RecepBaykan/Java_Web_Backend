package com.nontius.proje.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nontius.proje.model.Chat;
import com.nontius.proje.repository.ChatRepository;

@Service
public class ChatService {
	
	@Autowired
	private ChatRepository repository;
	
	public List<Chat> listChats(){
		
		return repository.findAll();
	}
	
	public void save(Chat chat) {
		
		repository.save(chat);
		
	}

}
