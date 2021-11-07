package com.michalkubiak.observer;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("Chart updated");
    }
}
