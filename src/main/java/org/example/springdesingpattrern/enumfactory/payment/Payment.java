package org.example.springdesingpattrern.enumfactory.payment;

import org.example.springdesingpattrern.dto.PaymentRequest;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 13:39
 */
public interface Payment {

    String pay(PaymentRequest paymentRequest);
}
