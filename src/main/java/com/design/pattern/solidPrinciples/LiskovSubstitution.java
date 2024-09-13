package com.design.pattern.solidPrinciples;

public class LiskovSubstitution {

    /**
     * Liskov Substitution Principle
     * Subclass should extend capability of parent class
     * not narrow it down ( not discard the functionality of parent class
     **/

    public static void main(String[] args) {

    }
}
// Bad code Example
interface  bike{
    void turnOnEngine();
    void accelerate();
}

class MoterCycle implements bike {
    @Override
    public void turnOnEngine() {
        System.out.println("Motercycle engine is turned on");
    }
    @Override
    public void accelerate() {
        System.out.println("Motercycle accelerates");
    }
}

class ByCycle implements bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError( " there is no engine available");
    }
    @Override
    public void accelerate() {
        System.out.println("Bycycle accelerates");
    }
}

