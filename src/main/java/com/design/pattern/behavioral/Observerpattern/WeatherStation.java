package com.design.pattern.behavioral.Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation  implements   WeatherObservable{

    private List<WeatherObserver> observers = new ArrayList<>();
        private  String weatherReport;

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer : observers){
            observer.updateWeather(weatherReport);
        }
    }

    public void setWeatherReport(String weatherReport) {
        this.weatherReport = weatherReport;
        notifyObservers();
    }
}
