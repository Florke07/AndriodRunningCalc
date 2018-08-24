package com.ms.runningcalc.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTest {

    private int m = 5000;
    private float km = 5.25f;
    private Distance distanceKM = new Distance(km);
    private Distance distanceM = new Distance(m);

    @Test
    public void metersToKilometers() {
        float testKM = distanceM.metersToKilometers();
        assertEquals(5, testKM, 0.01);
    }

    @Test
    public void kilometersToMeters() {
        int testM = distanceKM.kilometersToMeters();
        assertEquals(5250, testM);
    }

    @Test
    public void getKilometers() {
        assertEquals(distanceKM.getKilometers(), km, 0.01);
    }

    @Test
    public void getMeters() {
        assertEquals(distanceM.getMeters(), m, 0.01);
    }
}
