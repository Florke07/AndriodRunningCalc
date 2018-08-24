package com.ms.runningcalc.logic;

import com.ms.runningcalc.units.Distance;
import com.ms.runningcalc.units.Pace;
import com.ms.runningcalc.units.Speed;
import com.ms.runningcalc.units.Time;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsTest {

    private Time time = new Time(0, 50, 0);
    private Distance distance = new Distance(10.0f);

    @Test
    public void calcPace() {
        Pace pace = Calculations.calcPace(time, distance);
        assertEquals("5:0", pace.getPace());
    }

    @Test
    public void calcSpeedKMH() {
        Speed speed = Calculations.calcSpeed(time, distance);
        assertEquals(12f ,speed.getKmh(), 0.01);
    }
}
