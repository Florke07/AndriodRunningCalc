package com.ms.runningcalc.units;

public class Time {

    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    private int totalSeconds = 0;

    public Time(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int calcTotalSeconds(int hours, int minutes, int seconds) {
        totalSeconds = seconds + (60 * minutes) + (3600 * hours);
        return totalSeconds;
    }

    public int getSecondsFromTotal(int totalSeconds) {
        return (int) Math.floor((totalSeconds % 3600) % 60);
    }

    public int getMinutesFromTotal(int totalSeconds) {
        return (int) Math.floor((totalSeconds % 3600) / 60);
    }

    public int getHoursFromTotal(int totalSeconds) {
        return (int) Math.floor((totalSeconds / 3600));
    }

    public int getHours() {
        if (hours != 0) {
            return hours;
        } else {
            return getHoursFromTotal(totalSeconds);
        }
    }

    public int getMinutes() {
        if (minutes != 0) {
            return minutes;
        } else {
            return getMinutesFromTotal(totalSeconds);
        }
    }

    public int getSeconds() {
        if (seconds != 0) {
            return seconds;
        } else {
            return getSecondsFromTotal(totalSeconds);
        }
    }

    public int getTotalSeconds() {
        if (totalSeconds != 0) {
            return totalSeconds;
        } else {
            return calcTotalSeconds(hours, minutes, seconds);
        }
    }
}
