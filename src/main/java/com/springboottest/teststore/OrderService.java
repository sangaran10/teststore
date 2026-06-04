package com.springboottest.teststore;

import org.springframework.stereotype.Service;

// @Component: general purpose annotation
// @Service: classes that contain buisness logic
// @Repository: classes that interact with a database
// @Controller: classes that handles web requests
@Service
public class OrderService {
    private PaymentService paymentService;

    // @Autowired (in the past necessary to tell spring to autowire this object with its dependencies)
    // not necessary anymore if the class has a single constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
