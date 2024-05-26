package org.example.springdesingpattrern.strategy;

import org.example.springdesingpattrern.dto.PaymentRequest;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:48
 */
public interface PaymentStrategy {

    String pay( PaymentRequest paymentRequest );
}
