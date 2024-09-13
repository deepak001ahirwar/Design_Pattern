package com.design.pattern.creational.factory;

public class ShapeFactory {
    Shape getShapeFactory(String factoryName) {
        switch (factoryName) {
            case "Circle":
                return new Cirecle();
            case "Rectangle":
                return new Rectengale();
            default:
                return null;
        }

    }


}
