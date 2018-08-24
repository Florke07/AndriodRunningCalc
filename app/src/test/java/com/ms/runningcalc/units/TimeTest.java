package com.ms.runningcalc.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    private int h = 2;
    private int m = 16;
    private int s = 32;
    private int total = 8192;
    private Time timeTotal = new Time(total);
    private Time time = new Time(h, m, s);

    @Test
    public void calcTotalSeconds() {
        int totalSeconds = time.calcTotalSeconds(h, m, s);
        assertEquals(totalSeconds, total);
    }

    @Test
    public void getSecondsFromTotal() {
        int sec = timeTotal.getSecondsFromTotal(total);
        assertEquals(sec, s);
    }

    @Test
    public void getMinutesFromTotal() {
        int min = timeTotal.getMinutesFromTotal(total);
        assertEquals(min, m);
    }

    @Test
    public void getHoursFromTotal() {
        int hrs = timeTotal.getHoursFromTotal(total);
        assertEquals(hrs, h);
    }

    @Test
    public void getHours() {
        assertEquals(time.getHours(), h);
    }

    @Test
    public void getMinutes() {
        assertEquals(time.getMinutes(), m);
    }

    @Test
    public void getSeconds() {
        assertEquals(time.getSeconds(), s);
    }

    @Test
    public void getTotalSeconds() {
        assertEquals(timeTotal.getTotalSeconds(), total);
    }
}
