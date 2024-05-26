package org.example.springdesingpattrern.strategyfactory.strategy;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.springframework.stereotype.Service;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:51
 */

// ? ioc de bir Map olusturup key("wireTransfer" ) value (WireTransferStrategy instance) seklinde tutuyor(Map<String,PaymentStrategy>) ve kullanmak istetigimizde key ile cagirip kullanabiliyoruz.
@Service("wireTransfer")
public class WireTransferStrategy implements PaymentStrategy {
    /**
     * @param paymentRequest
     * @return
     */
    @Override
    public String pay(PaymentRequest paymentRequest) {
        return String.format("Payment wire transfer request: %s", paymentRequest.paymentType());
    }
}
