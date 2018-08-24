package com.ms.runningcalc.units;

public class Pace { //todo not finished
    private int minutes;
    private int seconds;

    public Pace(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutesPace() {
        return minutes;
    }

    public int getSecondsPace() {
        return seconds;
    }

    public String getPace() {
        return Integer.toString(minutes) + ":" + Integer.toString(seconds);
    }
}
