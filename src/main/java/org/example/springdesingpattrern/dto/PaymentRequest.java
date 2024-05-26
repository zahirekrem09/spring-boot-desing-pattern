package org.example.springdesingpattrern.dto;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:43
 */
public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType
) {
}
