package com.nontius.proje.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GameNotFound extends RuntimeException{

	public GameNotFound(String message) {
		super(message);
	}
}
	