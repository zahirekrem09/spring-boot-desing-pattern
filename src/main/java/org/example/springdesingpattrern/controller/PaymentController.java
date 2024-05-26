package org.example.springdesingpattrern.controller;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.example.springdesingpattrern.strategyfactory.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:39
 */

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

    // ? Dependency Injection (IOC) with Constructor Injection PaymentFactory
    private  final PaymentFactory paymentFactory;
    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        // ! burada if else  yapisi ile paymentType kontrol edebiliriz fakat bu SOLID e aykiri
        String response = paymentFactory.executePayment(paymentRequest);
        return ResponseEntity.ok(response);
    }


}
