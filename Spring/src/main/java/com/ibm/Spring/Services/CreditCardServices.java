package com.ibm.Spring.Services;

import org.springframework.stereotype.Component;

@Component("creditCardService")
public class CreditCardServices implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println(amount+"paid using credit card");

	}

}
