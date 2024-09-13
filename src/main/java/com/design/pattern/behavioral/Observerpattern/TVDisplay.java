package com.design.pattern.behavioral.Observerpattern;

public class TVDisplay implements WeatherObserver{

    @Override
    public void updateWeather(String weather) {
        System.out.println("TV Display: Current weather is " + weather);
    }
}
