package com.michalkubiak.strategy;

// Concrete implementation
public class BlackAndWhite implements Filtering {
    @Override
    public void filter(String file) {
        System.out.println("Apply Black And White Filter to image file");
    }
}
