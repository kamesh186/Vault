package com.app.Vault.Entity;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="tbl_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="User_Id")
	private Integer userId;
	@Column(name="User_Name")
	private String userName;
	@Column(name="Password")
	private String password;
	@Column(name="Role")
	private String role;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
	private UserInfo userInfo;
	
}
