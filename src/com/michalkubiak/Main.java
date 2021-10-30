package com.michalkubiak;

import com.michalkubiak.command.*;

public class Main {

    public static void main(String[] args) {

        var service = new UserService();
        // we need to pass this service into the AddUserCommand
        var command = new AddUserCommand(service);
        // Pass this object into the button
        var button = new Button(command);
        // perform click, which goes back to the user service and adds the user.
        button.click();

        var composite = new CompositeCommand();
        // Lets say a user wants to crop and image and filter it with one button
        // We add those commands into this composite command
        composite.add(new CropImageCommand());
        composite.add(new FilterCommand());

        // We can now execute every command in the composite object
        composite.execute();

    }
}
