package com.app.Vault.dto;

import java.util.Date;

import com.app.Vault.Entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class UserInfoDto {
	

	private Integer userId;
	private String firstname;
	private String lastname;
	private Date dob;
	private String email;


}
