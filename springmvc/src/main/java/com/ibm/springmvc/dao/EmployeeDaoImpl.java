package com.ibm.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private final JdbcTemplate jdbcTemplate;
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("Insert into employ(name,email,phone) values(?,?,?)",e.getName(),e.getEmail(),e.getPhone());
	}
}
