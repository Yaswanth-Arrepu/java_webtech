package com.ibm.springjdbc.template;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.springjdbc.EmployeeDao;
import com.ibm.springjdbc.mapper.EmployeeMapper;
import com.ibm.springjdbc.model.Employee;
public class EmployeeJDBCTemplate implements EmployeeDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		jdbcTemplateObject=new JdbcTemplate(dataSource);	
		
	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		String SQL="insert into Employee (firstname,lastname,salary) values(?,?,?)";
		jdbcTemplateObject.update(SQL,firstName,lastName,salary);
		System.out.println("created record name = "+firstName+" salary : "+salary);
		
	}

	@Override
	public Employee getEmployee(Integer Id) {
		String SQL= "select * from EMployee where id=?";
		Employee employee=jdbcTemplateObject.queryForObject(SQL,new EmployeeMapper(), Id);
		return employee;
	}

	@Override
	public  List<Employee> listEmployees() {
		String SQL="select * from Employee";
		List<Employee> employee= jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employee;
	}

	@Override
	public void delete(Integer id) {
		String SQL="delete from Employee where id=?";
		jdbcTemplateObject.update(SQL,id);
		System.out.println("Deleted Record with ID "+id);
		
	}

	@Override
	public void update(Integer id, String firstname, String lastname, Integer salary) {
		String SQL="update Employee set firstname=?,lastname=?,salary=? where id=?";
		jdbcTemplateObject.update(SQL,firstname, lastname,salary,id);
		System.out.println("Updated record with ID= "+id);
		
	}
	

}
