package com.springboottest.teststore;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeststoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TeststoreApplication.class, args);

		// Injection of Dependency
		// PaymentService easily exchangeable between Stripe and PayPal without changing Order Service
		var orderService = new OrderService(new PayPalPaymentService());

		orderService.placeOrder();
		
	}

}
