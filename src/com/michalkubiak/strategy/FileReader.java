package com.michalkubiak.strategy;

public class FileReader {

    private String compression;
    private String filter;

    public FileReader(String compression, String filter) {
        this.compression = compression;
        this.filter = filter;
    }

    public void storeFile(String file){
        if (compression == "jpeg")
            System.out.println("Compression with JPEG");   // usually this be an algorithm
        else if (compression == "png")
            System.out.println("Compresion with PNG");

        if(filter == "BlackAndWhite")
            System.out.println("Apply Black And White filter"); // And so on
    }
}
