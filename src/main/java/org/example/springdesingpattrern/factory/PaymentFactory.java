package org.example.springdesingpattrern.factory;

import org.example.springdesingpattrern.dto.PaymentRequest;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:41
 */
public interface PaymentFactory {
    String executePayment( PaymentRequest paymentRequest );
}
