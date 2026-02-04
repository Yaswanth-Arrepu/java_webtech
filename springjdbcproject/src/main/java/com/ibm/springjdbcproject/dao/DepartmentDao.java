package com.ibm.springjdbcproject.dao;

import java.util.List;

import com.ibm.springjdbcproject.model.Department;

public interface DepartmentDao {
	int save(Department d);

	int update(Department d);

	int delete(int id);

	Department findById(int id);

	List<Department> findAll();
}
