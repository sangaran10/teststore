package com.springboottest.teststore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeststoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TeststoreApplication.class, args);
		// Instead of manually creating objects and injecting dependencies, we let Spring take care of that
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

		// Injection of Dependency
		// PaymentService easily exchangeable between Stripe and PayPal without changing Order Service
		// var orderService = new OrderService(new PayPalPaymentService());

		// orderService.setPaymentService(new PayPalPaymentService());
		// Setter Injection possible for optional dependencies, mostly constructor injection used and recommended
	}

}
