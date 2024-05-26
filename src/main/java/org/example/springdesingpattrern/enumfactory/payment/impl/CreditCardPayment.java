package org.example.springdesingpattrern.enumfactory.payment.impl;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.example.springdesingpattrern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 13:40
 */

@Service
public class CreditCardPayment implements Payment {
    /**
     * @param paymentRequest
     * @return
     */
    @Override
    public String pay(PaymentRequest paymentRequest) {
        return String.format("Payment(EnumType Factory Pattern) credit card request: %s", paymentRequest.paymentType());
    }
}
