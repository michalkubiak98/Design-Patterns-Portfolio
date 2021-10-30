package com.michalkubiak.command;

public class FilterCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Applying Filter");
    }
}
