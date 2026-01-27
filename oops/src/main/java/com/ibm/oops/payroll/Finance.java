package com.ibm.oops.payroll;

public class Finance {
	public void processPay(Employee employee) {
		employee.netPay();
		if (employee instanceof PermanentEmployee) {
			PermanentEmployee permanentemployee=(PermanentEmployee)employee;
			permanentemployee.transportation();
		}
	}
}
