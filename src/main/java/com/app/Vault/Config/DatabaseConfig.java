package com.app.Vault.Config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
	
	
	@Value("${db.url}")
	private String dbHost;
	
	@Value("${db.username}")
	private String dbUserName;
	
	@Value("${db.password}")
	private String dbPassword;
	
	@Value("${db.driver-class-name}")
	private String dbDriverClassName;
	
	
	
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dbDriverClassName);
        dataSource.setUrl(dbHost);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

}
