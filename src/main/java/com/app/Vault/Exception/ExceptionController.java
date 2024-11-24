package com.app.Vault.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.Vault.dto.ErrorDto;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(UserCustomException.class)
	public ResponseEntity<ErrorDto> handleUserException(UserCustomException exception)
	{
		ErrorDto error=ErrorDto.builder().message(exception.getMessage()).
				Status(exception.getStatus()).code(exception.getCode()).build();
		return new ResponseEntity(error,HttpStatus.valueOf(exception.getStatus())) ;
		
	}

}
