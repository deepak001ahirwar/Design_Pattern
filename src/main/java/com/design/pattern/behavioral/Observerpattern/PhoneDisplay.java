package com.design.pattern.behavioral.Observerpattern;

public class PhoneDisplay  implements WeatherObserver{

    @Override
    public void updateWeather(String weather) {
        System.out.println("Phone Display: The weather is " + weather);
    }
}
