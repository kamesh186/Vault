package com.app.Vault.Entity;

import java.util.Date;

import org.hibernate.annotations.Fetch;

import ch.qos.logback.core.subst.Token.Type;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_User_Info")
public class UserInfo {

	@Id
	@Column(name="User_Id")
	private Integer userId;
	@Column(name="User_fname")
	private String firstname;
	@Column(name="User_lname")
	private String lastname;
	@Column(name="User_dob")
	private Date dob;
	@Column(name="User_Email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="User_Id")
	@MapsId
	private User user;
	
	
}
