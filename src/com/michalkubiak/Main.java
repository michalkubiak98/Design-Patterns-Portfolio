package com.michalkubiak;

import com.michalkubiak.strategy.BlackAndWhite;
import com.michalkubiak.strategy.FileReader;
import com.michalkubiak.strategy.JPEGCompression;

public class Main {

    public static void main(String[] args) {

        // We create a new fileReader which does JPEG compression ona file
        // In this case an image lets say
        // And will apply JPEG Compression and a Black and White filter!

        var fileReader = new FileReader(
                new JPEGCompression(),
                new BlackAndWhite()
                );

        // Apply the store file method
        fileReader.storeFile("Family Photo");


    };
}
