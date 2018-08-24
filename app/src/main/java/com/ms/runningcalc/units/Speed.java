package com.ms.runningcalc.units;

public class Speed {
    private float kmh = 0;
    private double ms = 0;

    public Speed(float kmh) {
        this.kmh = kmh;
    }

    public Speed(double ms) {
        this.ms = ms;
    }

    public double kmsToMs() {
        ms = kmh / 3.6f;
        return ms;
    }

    public double msToKms() {
        kmh = (float) (ms * 3.6);
        return kmh;
    }

    public float getKmh() {
        if (kmh != 0) {
            return kmh;
        } else {
            return (float) msToKms();

        }
    }

    public double getMs() {
        if (ms != 0) {
            return ms;
        } else {
            return kmsToMs();
        }
    }
}
