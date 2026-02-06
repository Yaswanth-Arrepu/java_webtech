package com.ibm.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.services.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
//	@GetMapping("/employee")
//	public Employee getEmployee() {
//		return new Employee(1,"Yaswanth","Arrepu","darlingyashu9424@gmail.com");
//	}
	private final EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEMployeeById(@PathVariable Long id){
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);	
	}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeedetails){
		return ResponseEntity.ok(employeeService.updateEmployee(id, employeedetails));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}
	@GetMapping("/{FirstName}/{Email}")
	public ResponseEntity<Employee> findByFirstNameAndEmail(@PathVariable String FirstName, @PathVariable String Email){
		return ResponseEntity.ok(employeeService.findByFirstNameAndEmail(FirstName, Email));
	}
}