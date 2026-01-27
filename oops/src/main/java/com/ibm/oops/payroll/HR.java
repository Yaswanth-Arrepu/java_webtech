package com.ibm.oops.payroll;

public class HR{
	public static Employee recruit(String emptype) {
		if (emptype.equalsIgnoreCase("I")){
			Intern intern=new Intern();
			return intern;
		}
		else if(emptype.equalsIgnoreCase("P")){
			return new PermanentEmployee();
		}
		else if(emptype.equalsIgnoreCase("F")) {
			return new Freelancer();
		}
		return null;
	}
}
