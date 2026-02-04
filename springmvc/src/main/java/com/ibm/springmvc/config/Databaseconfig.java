package com.ibm.springmvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.ibm.springmvc")
public class Databaseconfig {
	@Bean
	public DataSource dataSource() {
		HikariDataSource dat = new HikariDataSource();
		dat.setJdbcUrl("jdbc:mysql://localhost:3306/HR");
		dat.setUsername("Yaswanth");
		dat.setPassword("Lakshmi@31");
		dat.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dat;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
