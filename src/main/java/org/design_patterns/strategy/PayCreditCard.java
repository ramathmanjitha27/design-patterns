package org.design_patterns.strategy;

public class PayCreditCard implements PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
    }
}
