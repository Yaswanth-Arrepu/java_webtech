package com.ibm.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repositories.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository=employeeRepository;
	}
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	public Employee getEmployeeById(Long Id) {
		return employeeRepository.findById(Id)
					.orElseThrow(()-> new RuntimeException("EMployee not found with id: "+Id));
	}
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee= getEmployeeById(id);
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmail(employeeDetails.getEmail());
		return employeeRepository.save(employee);
	}
	public void deleteEmployee(Long id) {
		Employee employee=getEmployeeById(id);
		employeeRepository.delete(employee);
	}
	@Override
	public Employee findByFirstNameAndEmail(String firstname, String email) {
//		Optional<Employee> employee = employeeRepository.findByFirstNameAndEmail(firstname, email);
//		if(employee.isPresent()) {
//			Employee newEmployee = employee.get();
//			return newEmployee;
//		}
//		return null;
		Employee employee = employeeRepository.findByFirstNameAndEmail(firstname, email).orElseThrow(()->new RuntimeException("Employee not found"));
		return employee;
	}

}


