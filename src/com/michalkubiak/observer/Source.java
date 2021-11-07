package com.michalkubiak.observer;

public class Source extends Observable{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyObservers(number);
    }
}
