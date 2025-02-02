package com.design.pattern.behavioral.Observerpattern;

public interface WeatherObservable {

    public void addObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public void notifyObservers();
    public void setWeatherReport(String weatherReport) ;


    }
