package com.ms.runningcalc.units;

public class Distance {
    private int meters = 0;
    private float kilometers = 0;

    public Distance(int meters) {
        this.meters = meters;
    }

    public Distance(float kilometers) {
        this.kilometers = kilometers;
    }

    public float metersToKilometers() {
        kilometers = meters / 1000;
        return kilometers;
    }

    public int kilometersToMeters() {
        meters = (int) (kilometers * 1000);
        return meters;
    }

    public float getKilometers() {
        if (kilometers != 0) {
            return kilometers;
        } else {
            return metersToKilometers();
        }
    }

    public int getMeters() {
        if (meters != 0) {
            return meters;
        } else {
            return kilometersToMeters();
        }
    }
}
