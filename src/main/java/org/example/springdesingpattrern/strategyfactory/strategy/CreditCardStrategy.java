package org.example.springdesingpattrern.strategyfactory.strategy;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.springframework.stereotype.Service;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:49
 */


// ? ioc de bir Map olusturup key("creditCard" ) value (CreditCardStrategy instance) seklinde tutuyor ve
// ? kullanmak istetigimizde key ile cagirip kullanabiliyoruz . Ayni isimde kullanilirsa uygulama calismaz.
@Service("creditCard")
public class CreditCardStrategy implements PaymentStrategy {


    /**
     * @param paymentRequest
     * @return
     */
    @Override
    public String pay(PaymentRequest paymentRequest) {
        return String.format("Payment credit card request: %s", paymentRequest.paymentType());
    }
}
