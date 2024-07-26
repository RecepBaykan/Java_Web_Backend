package com.nontius.proje.controller;

import java.io.Serial;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nontius.proje.DTO.CreateUser;
import com.nontius.proje.DTO.ListMessages;
import com.nontius.proje.DTO.SendMessege;
import com.nontius.proje.DTO.UserDTO;
import com.nontius.proje.model.User;
import com.nontius.proje.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("createUser")	
	private String createUser(@RequestBody CreateUser newUser) {
		
		return service.createUser(newUser);	
	}
	
	@PostMapping("loginUser")	
	private String loginUser(@RequestBody CreateUser newUser) {
		
		return service.loginUser(newUser);	
	}
	
	@PostMapping("getToken")
	public String getToken(@RequestBody CreateUser newUser) {
		
		return service.getToken(newUser);
	}
	
	@PostMapping("chat")
	public String chat(@RequestBody  Map<String, String>  json) {
		
		String username = json.get("username").toString();
		
		
		SendMessege send = new SendMessege();
		
		send.setFromUser(username);
		return service.sendMessage(send);
	}
	
	@GetMapping("delete")
	public void deleteUser(@RequestParam String username){
		
		service.remove(username);
	
	}
	
	@GetMapping("listUser")
	public List<String> listUser(){
		
		return service.listUsername();
	}
	/*
	@PostMapping("sendMessage")
	public boolean sendMessage(@RequestBody SendMessage message) {
		
		
		
		return service.sendMessage(message);
		
	}
	
	@PostMapping("listMessage")
	public ListMessages listMessages(@RequestBody  Map<String, String> json) {
		
		String username = json.get("username").toString();
		
		return service.listMessages(username);
		
	}
	
	@PostMapping("sendCount")
	public int sendCount(@RequestBody  Map<String, String> json) {
		
		String username = json.get("username").toString();
		ListMessages listMessages = service.listMessages(username);
		
		
		
		return listMessages.getSend().size();
		
	}
	
	@PostMapping("recvCount")
	public int recvCount(@RequestBody  Map<String, String> json) {
		
		String username = json.get("username").toString();
		ListMessages listMessages = service.listMessages(username);
		
		return listMessages.getRecived().size();
		
	}
	
	@GetMapping("messageUsers")
	public List<String> messageUsers(@RequestBody  Map<String, String> json){
		
		String username = json.get("username").toString();
		return service.getMessageUsers(username);
	}*/
	
	

}
