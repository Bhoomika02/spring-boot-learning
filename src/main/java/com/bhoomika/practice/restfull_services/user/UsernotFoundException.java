package com.bhoomika.practice.restfull_services.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UsernotFoundException extends RuntimeException {
	
	public UsernotFoundException(String message){
		super(message);
	}
}
