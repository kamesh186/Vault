package com.app.Vault.Util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.app.Vault.Exception.UserCustomException;
import com.app.Vault.dto.UserDto;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

@Service
public class UserValidator {

	Logger log=LoggerFactory.getLogger(UserValidator.class);


    public void validateUser(UserDto userDto) {
    	
    	   ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
           
           Validator validator = factory.getValidator();
        // Manually validate the object
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);
        if (!violations.isEmpty()) {
            // Handle validation errors
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<UserDto> violation : violations) {
                sb.append(violation.getPropertyPath()).append(": ").append(violation.getMessage()).append("|");
            }
            throw new UserCustomException("USER001", sb.toString(),400);
        }
        else
        {
        	log.info("UserDto is valid");
        }
    }
}
