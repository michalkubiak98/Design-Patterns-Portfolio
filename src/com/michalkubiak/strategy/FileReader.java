package com.michalkubiak.strategy;

public class FileReader {

    // Changed the type to Compression instead of String | Also Filtering
    private Compression compression;
    private Filtering filter;

    // Change the FileReader compression type from String to Compression
    public FileReader(Compression compression, Filtering filter) {
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
        // Filter method of Filter concrete class
        // Now we have flexibility in our Main class when using the File Reader!
        filter.filter(file);

    }
}
