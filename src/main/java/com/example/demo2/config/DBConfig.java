package com.example.demo2.config;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {
    @Bean
	public DataSource dataSource() {
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        //dataSourceBuilder.driverClassName("org.sqlite.JDBC");
	        //dataSourceBuilder.url("jdbc:sqlite:srirubber-v3.db");
                        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
	        dataSourceBuilder.url("jdbc:mysql://localhost:3306/mydatabase");
                
	        return dataSourceBuilder.build();   
	}
}
