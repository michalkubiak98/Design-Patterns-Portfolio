package com.michalkubiak.template;

public class TransferFunds {

    private RecordActivities recordActivities;

    public TransferFunds(RecordActivities recordActivities) {
        this.recordActivities = recordActivities;
    }

    // Task which records the trasfer and transfers money.
    public void task(){
        // This records the activities
        recordActivities.record();

        System.out.println("Transfer Funds");

    }
}
