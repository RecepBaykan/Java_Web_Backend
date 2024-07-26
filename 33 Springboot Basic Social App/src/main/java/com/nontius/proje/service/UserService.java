package com.nontius.proje.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Jwts.KEY;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.util.Date;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ssl.SslBundleProperties.Key;
import org.springframework.stereotype.Service;

import com.nontius.proje.DTO.CreateUser;
import com.nontius.proje.DTO.ListMessages;
import com.nontius.proje.DTO.SendMessege;
import com.nontius.proje.DTO.UserDTO;
import com.nontius.proje.model.Chat;
import com.nontius.proje.model.Message;
import com.nontius.proje.model.MessageType;
import com.nontius.proje.model.SendedMessage;
import com.nontius.proje.model.User;

import com.nontius.proje.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private com.nontius.proje.repository.MessageRepository messageRepository;

	@Autowired
	private ChatService chatService;

	public String createUser(CreateUser newUser) {

		Error error = Error.NO_ERROR;

		User user = new User();
		user.setUsername(newUser.getUsername());
		user.setPassword(newUser.getPassword());

		for (User u : repository.findAll()) {
			if (u.getUsername().equals(user.getUsername())) {
				error = Error.SAME_USERNAME;
				break;
			}
		}

		if (error == Error.NO_ERROR) {

			repository.save(user);
		}

		return error.toString();

	}

	public String loginUser(CreateUser loginUser) {

		Error err = Error.USER_NOT_FOUND;

		for (User user : repository.findAll()) {

			if (user.getUsername().equals(loginUser.getUsername())) {

				if (user.getPassword().equals(loginUser.getPassword())) {
					err = Error.NO_ERROR;
					break;

				} else {
					err = Error.WRONG_PASSWORD;
					break;
				}
			}
		}

		return err.toString();

	}

	public String getToken(CreateUser user) {

		return JwtUtil.generateToken(user.getUsername());

	}

	public void remove(String username) {

		List<User> users = repository.findAll();

		for (User user : users) {
			if (user.getUsername().equals(username)) {
				repository.delete(user);
				break;
			}
		}

	}

	public List<String> listUsername() {

		List<User> users = repository.findAll();

		List<String> usernames = new ArrayList<String>();

		for (User user : users) {
			usernames.add(user.getUsername());
		}

		return usernames;

	}

	public String sendMessage(SendMessege sendMessage) {

		boolean startChat = false;

		// Find user
		User user = repository.findByUsername(sendMessage.getFromUser());
		
		List<User> users = new ArrayList<User>();
		
		for(String s : sendMessage.getToUsers()) {
			
			users.add(repository.findByUsername(s));
		}
		
		// Chat geçmişi var mı?
		for(Chat chat : user.getChat()) {
			
			if(chat.getUsers().size() == sendMessage.getToUsers().size()) {
				
				
			}
		}


		return user.getId();
	}

}

enum Error {
	NO_ERROR, SAME_USERNAME, WRONG_PASSWORD, USER_NOT_FOUND
}

class JwtUtil {

	private static String SECRET_KEY = ""; // Güvenli bir şekilde saklanmalı
	static byte[] bytes = new byte[32];
	static SecureRandom random = new SecureRandom();

	public static String generateToken(String username) {
		random.nextBytes(bytes);
		SECRET_KEY = Base64.getEncoder().encodeToString(bytes);
		String token = Jwts.builder().claim("username", username).signWith(SignatureAlgorithm.HS256, SECRET_KEY)
				.compact();
		return token;
	}

}
