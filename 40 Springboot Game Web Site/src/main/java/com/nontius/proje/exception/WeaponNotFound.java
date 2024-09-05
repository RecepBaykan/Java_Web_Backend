package com.nontius.proje.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class WeaponNotFound extends RuntimeException {
	
	public WeaponNotFound(String message) {
		super(message);
	}

}
