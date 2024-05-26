package org.example.springdesingpattrern.enumfactory;

import org.example.springdesingpattrern.dto.PaymentRequest;
import org.example.springdesingpattrern.enumfactory.payment.impl.CreditCardPayment;
import org.example.springdesingpattrern.enumfactory.payment.Payment;
import org.example.springdesingpattrern.enumfactory.payment.impl.WireTransferPayment;

/**
 * @author Zahir Ekrem SARITEKE
 * @project spring-desing-pattrern
 * @created 26 May Sunday 2024 - 13:32
 */
public enum PaymentEnumType {
    CREDIT_CARD("creditCard" , new CreditCardPayment()) {

        @Override
        public String _payWithAbstract(PaymentRequest paymentRequest) {
            return String.format("Payment(EnumType Factory Pattern) credit card request: %s", paymentRequest.paymentType());
        }
    },
    WIRE_TRANSFER("wireTransfer" , new WireTransferPayment()) {

        @Override
        public String _payWithAbstract(PaymentRequest paymentRequest) {
            return String.format("Payment(EnumType Factory Pattern) wire transfer request: %s", paymentRequest.paymentType());
        }
    };
     // buraya baska bir object de ekleyebilirz

    private String value;
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public String getValue() {
        return value;
    }

    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }




    // ? PaymentEnumType.CREDIT_CARD.getValue()   - ( = "creditCard") seklinde cagirip kullanabiliriz.

    public static PaymentEnumType getPaymentEnumType(String enumName) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.value.equals(enumName)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Invalid payment type: " + enumName);

    }

    // ? Enum icersinde abstract method tanimlayabiliriz ve bunu her bir deger icin override edebiliriz.
    // ? Bu sekilde yapilirsa Payment interface ve ilgili implementasyonlari yapmadan ilgili method u enum degerine gore yapabiliriz.
    abstract public String _payWithAbstract(PaymentRequest paymentRequest);
}
