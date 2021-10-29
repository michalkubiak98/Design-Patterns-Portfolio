package com.michalkubiak.template;

public class SaveReport {

    private RecordActivities recordActivities;

    public SaveReport(RecordActivities recordActivities) {
        this.recordActivities = recordActivities;
    }

    public void taks(){
        recordActivities.record();

        System.out.println("Save Report");
    }
}
