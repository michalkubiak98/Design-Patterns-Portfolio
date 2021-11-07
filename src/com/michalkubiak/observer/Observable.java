package com.michalkubiak.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
public class Observable {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(int number){
        for(var observer : observers){
            observer.update(number);
        }
    }
}
