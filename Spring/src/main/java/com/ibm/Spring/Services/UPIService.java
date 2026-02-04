package com.ibm.Spring.Services;

import org.springframework.stereotype.Component;

@Component("UPIService")
public class UPIService implements PaymentService{
	@Override
	public void processPayment(double amount) {
		System.out.println(amount+" is paid by UPI");
		
	}

}
