package com.michalkubiak.template;

public class TransferFunds extends Task{

    @Override
    protected void callExecute() {
        // Here we define our logic for executing the transfer of funds
        System.out.println("Funds Transfered");
    }
}
