package com.michalkubiak.command;

public class AddUserCommand implements Command{
    private UserService userService;

    public AddUserCommand(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void execute() {
        userService.addUser();
    }
}
