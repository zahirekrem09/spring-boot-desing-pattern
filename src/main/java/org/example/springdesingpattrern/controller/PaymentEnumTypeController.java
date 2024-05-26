package org.example.springdesingpattrern.controller;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.example.springdesingpattrern.enumfactory.PaymentEnumType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 13:28
 */

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumTypeController {



    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest) {
        // * find payment type
        PaymentEnumType paymentEnumType = PaymentEnumType.getPaymentEnumType(paymentRequest.paymentType());
        // * execute payment with payment type
        String response = paymentEnumType.getPayment().pay(paymentRequest);

        // ! whit abstract method
        // String response2 = paymentEnumType._payWithAbstract(paymentRequest);

        return ResponseEntity.ok(response);
    }
}
