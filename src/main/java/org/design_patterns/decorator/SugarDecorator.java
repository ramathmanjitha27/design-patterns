package org.design_patterns.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String makeCoffee() {
        return super.makeCoffee() + ", Sugar";
    }
}
