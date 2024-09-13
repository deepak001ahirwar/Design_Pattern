package com.design.pattern.structural.decorator;

public class DecoratorPattern {
    /**
     * The Decorator Design Pattern is a structural design pattern used in software development.
     * It allows behavior to be added to individual objects, dynamically, without affecting the
     * behavior of other objects from the same class. This pattern is useful when you need to add
     * functionality to objects in a flexible and reusable way.
     */
    public static void main(String[] args) {


        // plain coffee
        Coffee coffee = new PlaneCoffee();
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Cost: "+coffee.getCost());

        // coffee with milk

        Coffee coffeeWithmilk = new MilkDecorator(coffee);
        System.out.println("Description: "+coffeeWithmilk.getDescription());
        System.out.println("Cost: "+coffeeWithmilk.getCost());

        // coffee with sugar
        Coffee  coffeeWithsugar = new SugarDecorator(coffee);
        System.out.println("Description: "+coffeeWithsugar.getDescription());
        System.out.println("Cost: "+coffeeWithsugar.getCost());





    }
}
