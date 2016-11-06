package com.customer.exception;

import org.springframework.stereotype.Repository;


public class DuplicateRecordException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	 public DuplicateRecordException(String message){
		super(message);
	}

}
