package com.app.Vault.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.websocket.OnMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "userName should not be null")
	@NotEmpty(message = "userName should not be empty")
	private String userName;

	@NotNull(message = "password should not be null")
	@NotEmpty(message = "password should not be empty")
	private String password;

	private String role;

	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
