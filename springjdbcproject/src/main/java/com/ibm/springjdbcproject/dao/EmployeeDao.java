package com.ibm.springjdbcproject.dao;

import java.util.List;

import com.ibm.springjdbcproject.model.Employee;

public interface EmployeeDao {
	int save(Employee e);

	int update(Employee e);

	int delete(int id);

	Employee findById(int id);

	List<Employee> findAll();
}