package com.michalkubiak.strategy;

public class FileReader {

    // Changed the type to Compression instead of String
    private Compression compression;
    private String filter;

    // Change the FileReader compression type from String to Compression
    public FileReader(Compression compression, String filter) {
        this.compression = compression;
        this.filter = filter;
    }

    // We now simply get rid of the if else statements and delegate this request to store the file
    // To a seperate object, and pass the file name to the compression method of the
    // Compression object, The could be named differently but for simplicity i went
    // With just the same names, in a real production eneviornment they would have better
    // Naming Conventions!

    public void storeFile(String file){
        compression.compression(file);

        if(filter == "BlackAndWhite")
            System.out.println("Apply Black And White filter"); // And so on
    }
}
