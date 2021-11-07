package com.michalkubiak.observer;

public class Calendar implements Observer{

    @Override
    public void update(int number) {
        System.out.println("Calendar updated: " + number);
    }
}
