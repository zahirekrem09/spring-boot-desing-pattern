package org.example.springdesingpattrern.factory.impl;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.example.springdesingpattrern.factory.PaymentFactory;
import org.example.springdesingpattrern.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 12:45
 */

@Component
public class PaymentFactoryImpl implements PaymentFactory {

    // * Dependency Injection (IOC)
    private final Map<String, PaymentStrategy> paymentStrategyMap;
    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    /**
     * Retrieves the PaymentStrategy associated with the given payment type from the paymentStrategyMap.
     *
     * @param  paymentType  the type of payment for which to retrieve the PaymentStrategy
     * @return              the PaymentStrategy associated with the given payment type, or null if no such strategy exists
     */
    public PaymentStrategy getPaymentStrategyMap(String paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType);
        // ! Exception Handling gelen type uygun bir PaymentStrategy bulunamadıysa hata fırlatır.
        if (paymentStrategy
                == null) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        return paymentStrategy;
    }



    /**
     * @param paymentRequest
     * @return
     */
    @Override
    public String executePayment(PaymentRequest paymentRequest) {

        PaymentStrategy paymentStrategy = getPaymentStrategyMap(paymentRequest.paymentType());
        return paymentStrategy.pay(paymentRequest);
    }
}
