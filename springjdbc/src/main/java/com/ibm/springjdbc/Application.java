package com.ibm.springjdbc;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ibm.springjdbc.model.Employee;
import com.ibm.springjdbc.template.EmployeeJDBCTemplate;
public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeJDBCTemplate employeeJDBCTemplate=(EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplateBean");
//		System.out.println("--------Records Creation--------");
//		employeeJDBCTemplate.create("Yaswanth", "Arrepu", 32000);
//		employeeJDBCTemplate.create("Smith","Steeve",20000);
//		System.out.println("-----------Listing multiple records---------");
		employeeJDBCTemplate.update(3, "Mahendra Singh","Dhoni", 50000);
		List<Employee> employees= employeeJDBCTemplate.listEmployees();
		for (Employee employee: employees) {
			System.out.print("ID: "+employee.getId());
			System.out.print(", FirstName: "+employee.getFirstName());
			System.out.println(", LastName: "+employee.getLastName());
			System.out.println(", Salary: "+employee.getSalary());
		}
//		employeeJDBCTemplate.delete(7);


		
	}
}