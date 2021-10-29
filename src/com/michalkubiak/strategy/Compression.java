package com.michalkubiak.strategy;

public interface Compression {

    // This would suually be the case as the files would be compressed in bytes
    // byte[] compression(byte[] file);

    // For simplicity, we will just have a string here to demonstrate Strategy.
    void compression(String file);
}
