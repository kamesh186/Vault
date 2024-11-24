package com.app.Vault.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.Vault.Entity.UserInfo;

@EnableJpaRepositories
public interface UserInfoRepository  extends JpaRepository<UserInfo, Integer>{


	
}
