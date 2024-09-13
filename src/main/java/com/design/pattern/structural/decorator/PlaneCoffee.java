package com.design.pattern.structural.decorator;

public class PlaneCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Plane Coffee";
    }
    @Override
    public double getCost() {
        return 5.0;
    }

}
