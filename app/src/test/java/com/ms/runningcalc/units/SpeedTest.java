package com.ms.runningcalc.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeedTest {

    private float kmh = 9;
    private double ms = 1.3;
    private Speed speedKMH = new Speed(kmh);
    private Speed speedMS = new Speed(ms);


    @Test
    public void getKmh() {
        assertEquals(kmh, speedKMH.getKmh(), 0.01);
    }

    @Test
    public void getMs() {
        assertEquals(ms, speedMS.getMs(), 0.01);
    }
}
