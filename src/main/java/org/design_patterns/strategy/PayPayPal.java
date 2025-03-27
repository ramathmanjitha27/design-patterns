package org.design_patterns.strategy;

public class PayPayPal implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
