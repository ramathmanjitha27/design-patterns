package org.design_patterns.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String makeCoffee() {
        return super.makeCoffee() + ", Milk";
    }
}
