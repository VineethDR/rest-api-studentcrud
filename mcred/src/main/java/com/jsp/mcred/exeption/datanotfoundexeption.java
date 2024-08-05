package com.jsp.mcred.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class datanotfoundexeption  {
	@ExceptionHandler(myexeptionhandler.class)
public ResponseEntity<String> filenotfoundexeption(myexeptionhandler exception){
	return new ResponseEntity<String> (exception.getMessage(),HttpStatus.NOT_FOUND);
}
}
