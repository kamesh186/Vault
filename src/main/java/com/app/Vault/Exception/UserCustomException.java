package com.app.Vault.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserCustomException extends RuntimeException{
	
	private String code;
	private int Status;
	public UserCustomException(String code, String message, int status) {
		super(message);
		this.code = code;
		Status = status;
	}
	
	
}
