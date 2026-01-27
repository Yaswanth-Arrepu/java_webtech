package com.ibm.oops;
import com.ibm.oops.payroll.Employee;
import com.ibm.oops.payroll.HR;
import com.ibm.oops.payroll.Intern;
import com.ibm.oops.payroll.PermanentEmployee;
import com.ibm.oops.payroll.Finance;
public class Application
{
	public static void main( String[] args )
	{
//		Employee employee=HR.recruit("I");
//		if (employee!= null) {
//			employee.netPay();
//		}
//		employee=HR.recruit("P");
//		if(employee!=null) {
//			employee.netPay();
//		}
		Finance finance =new Finance();
		Employee employee=HR.recruit("I");
		if (employee!= null) {
			finance.processPay(employee);
		}
		employee=HR.recruit("P");
		if(employee!=null) {
			finance.processPay(employee);
		}
		employee=HR.recruit("F");
		if(employee!=null) {
			finance.processPay(employee);
		}
	}
}