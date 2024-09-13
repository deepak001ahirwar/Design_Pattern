package com.design.pattern.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedcoffee;

    public CoffeeDecorator(Coffee decoratedcoffee) {
        this.decoratedcoffee = decoratedcoffee;
    }

    @Override
    public String getDescription() {
        return decoratedcoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedcoffee.getCost();
    }

}
