package com.design.pattern.behavioral.Observerpattern;

public class Observerpattern {

    /**
     The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency
     between objects so that when one object (the subject) changes state,
     all its dependents (observers) are notified and updated automatically.
     */

    public static void main(String[] args) {
         WeatherObservable subject = new WeatherStation();
         WeatherObserver observer1 = new PhoneDisplay();
         WeatherObserver observer2 = new TVDisplay();
         subject.addObserver(observer1);
         subject.addObserver(observer2);

         subject.setWeatherReport(" Sunny ");

    }



}
