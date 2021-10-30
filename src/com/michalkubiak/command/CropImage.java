package com.michalkubiak.command;

public class CropImage implements Command{

    @Override
    public void execute() {
        System.out.println("Image Cropped");
    }
}
