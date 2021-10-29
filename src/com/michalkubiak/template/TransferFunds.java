package com.michalkubiak.template;

public class TransferFunds extends Task{

    // New constructor using super
    public TransferFunds(RecordActivities recordActivities) {
        super(recordActivities);
    }

    @Override
    public void callExecute() {
        // Here we define our logic for executing the transfer of funds
        System.out.println("Funds Transfered");
    }
}
