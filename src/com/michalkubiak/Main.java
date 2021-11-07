package com.michalkubiak;

import com.michalkubiak.observer.Calendar;
import com.michalkubiak.observer.Chart;
import com.michalkubiak.observer.Source;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var source = new Source();
        var calendar = new Calendar();
        var calendar2 = new Calendar();
        var chart = new Chart();

        source.addObserver(calendar);
        source.addObserver(calendar2);
        source.addObserver(chart);

        // Set the number which then notifies the calendar and chart
        source.setNumber(1);
    }
}
