package com.ibm.springmvc.services;

import org.springframework.stereotype.Service;
import com.ibm.springmvc.dao.EmployeeDao;
import com.ibm.springmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    // Constructor injection (preferred)
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.save(employee);
		System.out.println("Employee details inserted");
	}
}
