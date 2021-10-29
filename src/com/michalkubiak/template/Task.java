package com.michalkubiak.template;

public class Task {


    private RecordActivities recordActivities;

    public Task(RecordActivities recordActivities) {
        this.recordActivities = recordActivities;
    }

    // Template for executing our tasks
    public void execute() {
        recordActivities.record();

        // what happens after here is determined by the subclasses
    }



}
