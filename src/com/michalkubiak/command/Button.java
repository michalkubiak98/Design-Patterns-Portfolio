package com.michalkubiak.command;

public class Button {

    private String label;
    // Adding a new Command field
    private Command command;

    // Adding a Constructor to initialize the command field
    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
