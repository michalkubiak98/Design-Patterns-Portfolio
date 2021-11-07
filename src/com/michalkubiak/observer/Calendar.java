package com.michalkubiak.observer;

public class Calendar implements Observer{

    @Override
    public void update() {
        System.out.println("Calendar updated");
    }
}
