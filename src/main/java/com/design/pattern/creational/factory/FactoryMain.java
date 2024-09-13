package com.design.pattern.creational.factory;

public class FactoryMain
{

    /**
     * The Factory Method Design Pattern is a creational design pattern that provides an interface
     * for creating objects in a superclass, allowing subclasses to alter the type of objects
     * that will be created.
     * This pattern is particularly useful when the exact types of objects to be created may vary or
     * need to be determined at runtime, enabling flexibility and extensibility in object creation.
     */
    public static void main(String[] args) {

        // Using ShapeFactory1

        ShapeFactory shapeFactory1 = new ShapeFactory();
        Shape circle = shapeFactory1.getShapeFactory("Circle");
        circle.draw();
    }
}
