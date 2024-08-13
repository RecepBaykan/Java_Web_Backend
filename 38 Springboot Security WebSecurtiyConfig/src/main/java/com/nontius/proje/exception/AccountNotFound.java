package com.nontius.proje.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AccountNotFound extends RuntimeException{

	public AccountNotFound(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
