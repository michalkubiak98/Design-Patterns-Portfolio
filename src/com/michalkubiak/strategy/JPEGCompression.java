package com.michalkubiak.strategy;

// This concrete class implements the compression interface
// Another class called PNGCompression could be created, as any other
// Class using differnet compression types.

public class JPEGCompression implements Compression{
    @Override
    public void compression(String file) {
        System.out.println("Compression done with JPEG Algorithm");

    }
}
