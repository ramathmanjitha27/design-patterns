package org.design_patterns.decorator;

abstract public class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String makeCoffee() {
        return coffee.makeCoffee();
    }
}
