package com.design.pattern.structural.decorator;

public class MilkDecorator  extends  CoffeeDecorator{

    public MilkDecorator(Coffee decoratedcoffee) {
        super(decoratedcoffee);
    }
    @Override
    public String getDescription() {
        return decoratedcoffee.getDescription() + ", Milk";
    }
    @Override
    public double getCost() {
        return decoratedcoffee.getCost() + 10;
    }


}
