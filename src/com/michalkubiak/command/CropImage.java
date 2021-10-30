package com.michalkubiak.command;

public abstract class CropImage implements Command{

    @Override
    public void execute() {
        System.out.println("Image Cropped");
    }
}
