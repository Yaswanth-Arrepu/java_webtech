package com.ibm.springjdbcproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.springjdbcproject.config.DatabaseConfig;
import com.ibm.springjdbcproject.dao.DepartmentDao;
import com.ibm.springjdbcproject.dao.EmployeeDao;
import com.ibm.springjdbcproject.model.Department;
import com.ibm.springjdbcproject.model.Employee;

public class Application
{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);

		DepartmentDao departmentDao = ctx.getBean(DepartmentDao.class);
		EmployeeDao employeeDao = ctx.getBean(EmployeeDao.class);

		Department d = new Department();
		d.setName("IT");
		departmentDao.save(d);

		Employee e = new Employee();
		e.setName("Arafath");
		e.setSalary(15000);
		e.setDepartmentId(1);
		employeeDao.save(e);

		employeeDao.findAll().forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDepartmentId()+ " - " + emp.getSalary()));

		ctx.close();
	}
}