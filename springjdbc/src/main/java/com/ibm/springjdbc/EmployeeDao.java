package com.ibm.springjdbc;

import java.util.List;

import javax.sql.DataSource;

import com.ibm.springjdbc.model.Employee;

public interface EmployeeDao {
	public void setDataSource(DataSource dataSource);
	public void create(String firstName, String lastName, Integer salary);
	public Employee getEmployee(Integer Id);
	public List<Employee> listEmployees();
	public void delete(Integer id);
	public void update(Integer id, String firstname, String lastname, Integer salary);

}
