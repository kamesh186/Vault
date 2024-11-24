package com.app.Vault;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Vault.Controller.UserController;
import com.app.Vault.Entity.UserInfo;
import com.app.Vault.Exception.UserCustomException;
import com.app.Vault.Repository.UserInfoRepository;
import com.app.Vault.Repository.UserRepository;
import com.app.Vault.dto.UserInfoDto;

@Service
public class UserService {
	
	Logger log=LoggerFactory.getLogger(UserService.class);
	
	
@Autowired
UserRepository userRepository;

@Autowired
UserInfoRepository userInfoRepository;

public UserInfoDto getUserDetails(Integer userId)
{
	log.info("In getUserdetails() method");
	Optional<UserInfo> userInfo= userInfoRepository.findById(userId);
	UserInfoDto userDto;
	if(userInfo.isPresent())
	{
		UserInfo user=userInfo.get();
		userDto=UserInfoDto.builder().firstname(user.getFirstname()).lastname(user.getLastname()).
				dob(user.getDob()).email(user.getEmail()).userId(user.getUser().getUserId()).build();
		log.info("UserId {} details retrieved successfully",userId);
	}
	else
	{
		log.error("UserId {} not found",userId);
		throw new UserCustomException("User001","User Not found",404);
	}
	return userDto;

}
	
}
