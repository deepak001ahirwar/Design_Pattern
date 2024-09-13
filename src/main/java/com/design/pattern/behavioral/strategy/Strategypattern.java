package com.design.pattern.behavioral.strategy;

public class Strategypattern {

    /**
     * 1- The Strategy Design Pattern in Java defines a family of algorithms,
     * encapsulates each one, and makes them interchangeable,
     * allowing clients to switch algorithms dynamically without altering the code structure.
     * 2- that allows the behavior of an object to be selected at runtime.
     */

    public static void main(String[] args) {

        // Bad code Example
//        Vehicle normalVehicle = new Vehicle();
//        normalVehicle.drive();     // Normal Drive Mode
//        SportsVehicle vehicle = new SportsVehicle();
//        vehicle.drive();          // Normal Drive Mode
//        PassangerVehicle passangerVehicle = new PassangerVehicle();
//        passangerVehicle.drive();     //Normal Drive Mode
//        OffRoadVehicle offroadVehicle = new OffRoadVehicle();
//        offroadVehicle.drive();  //Sports Drive Mode
//        GoodVehicle goodVehicle = new GoodVehicle();
//        goodVehicle.drive();   //Good Drive Mode

        // Strategy Pattern
        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
        Vehicle goodVehicle = new GoodVehicle();
        goodVehicle.drive();


    }
}

// Bad code Example
//class Vehicle{
//    public void drive(){
//        System.out.println("Normal Drive Mode");
//    }
//}
//class SportsVehicle extends  Vehicle{
//
//    public void drive(){
//        System.out.println("Sports Drive Mode");
//    }
//}
//
//class PassangerVehicle extends Vehicle{
//
//}
//class OffRoadVehicle extends Vehicle{
//    @Override
//    public void drive(){
//        System.out.println("Sports Drive Mode");
//    }
//}
//class GoodVehicle extends Vehicle{
//
//    @Override
//    public void drive(){
//        System.out.println("Good Drive Mode");
//    }
//}



// Strategy Pattern

interface  DriveStrategy {
    public void drive();
}

// imp class
class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Mode");
    }
}
class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Mode");
    }
}

// Main Scture class
class Vehicle{
     DriveStrategy driveStrategy;

    // constructor injection parameters
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
// clint uses class
class OffRoadVehicle extends Vehicle{

    //Constructor injection
    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}
class GoodVehicle extends Vehicle{
    public GoodVehicle() {
        super(new NormalDrive());
    }
}