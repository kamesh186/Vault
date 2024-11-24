package com.app.Vault.Controller;

import java.util.Optional;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Vault.UserService;
import com.app.Vault.Entity.User;
import com.app.Vault.Exception.UserCustomException;
import com.app.Vault.Repository.UserRepository;
import com.app.Vault.Util.UserValidator;
import com.app.Vault.dto.UserDto;
import com.app.Vault.dto.UserInfoDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserValidator userValidator;
	
	@GetMapping("/{id}")
	public ResponseEntity<UserInfoDto> getUser(@PathVariable Integer id)
	{
		log.info("In User controller");
		UserInfoDto userDto=userService.getUserDetails(id);
				return new ResponseEntity<UserInfoDto>(userDto,HttpStatus.OK);
	}
	
	@PostMapping
	public String createUser( @RequestBody UserDto userDto)
	{
		log.info("request received {}",userDto.toString());
		
		userValidator.validateUser(userDto);
		return null;
		
	}
	
	
	

}
