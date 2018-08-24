package com.ms.runningcalc.units;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaceTest {
    private int min = 4;
    private int sec = 20;
    private Pace pace = new Pace(min, sec);

    @Test
    public void getMinutesPace() {
        assertEquals(pace.getMinutesPace(), min);
    }

    @Test
    public void getSecondsPace() {
        assertEquals(pace.getSecondsPace(), sec);
    }

    @Test
    public void getPace() {
        assertEquals("4:20", pace.getPace());
    }

}
