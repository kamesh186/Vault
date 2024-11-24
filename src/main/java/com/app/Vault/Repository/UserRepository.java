package com.app.Vault.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.Vault.Entity.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{
	


}
