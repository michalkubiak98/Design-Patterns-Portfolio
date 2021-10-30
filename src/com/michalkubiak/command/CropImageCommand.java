package com.michalkubiak.command;

public class CropImageCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Image Cropped");
    }
}
