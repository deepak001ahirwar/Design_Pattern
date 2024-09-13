package com.design.pattern.structural.decorator;

public class SugarDecorator  extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedcoffee) {
        super(decoratedcoffee);
    }
    @Override
    public String getDescription() {
        return decoratedcoffee.getDescription() + ", with sugar";
    }
    @Override
    public double getCost() {
        return decoratedcoffee.getCost() + 5;
    }

}
