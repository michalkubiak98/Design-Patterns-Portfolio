package com.michalkubiak.command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    // A method which adds commands to the commands ArrayList
    public void add(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (var command: commands){
            command.execute();
        }
    }
}
