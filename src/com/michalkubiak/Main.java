package com.michalkubiak;

import com.michalkubiak.command.AddUserCommand;
import com.michalkubiak.command.Button;
import com.michalkubiak.command.UserService;

public class Main {

    public static void main(String[] args) {

        var service = new UserService();
        // we need to pass this service into the AddUserCommand
        var command = new AddUserCommand(service);
        // Pass this object into the button
        var button = new Button(command);
        // perform click, which goes back to the user service and adds the user.
        button.click();
        // TextBox
        // Checkbox
    }
}
