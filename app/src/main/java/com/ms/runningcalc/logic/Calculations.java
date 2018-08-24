package com.ms.runningcalc.logic;

import com.ms.runningcalc.units.Distance;
import com.ms.runningcalc.units.Pace;
import com.ms.runningcalc.units.Speed;
import com.ms.runningcalc.units.Time;
import java.text.DecimalFormat;

public class Calculations {

    private static DecimalFormat formatter = new DecimalFormat("#,###");

    public static Pace calcPace(final Time time, final Distance distance) {
        float t1 = (time.getTotalSeconds() * 1000);
        float t2 = t1 / distance.getMeters();
        float t3 = t2 / 60;
        float tmpTime = t3;
        //tmpTime = Float.valueOf(formatter.format(tmpTime));
        double total = Math.floor(tmpTime);
        double fraction = tmpTime - total;
        fraction *= 60;
        return new Pace((int) total, (int) fraction);
    }

    public static Speed calcSpeed(final Time time, final Distance distance) {
        double spd = (((double) distance.getMeters()) / ((double) time.getTotalSeconds()));
        Speed speed = new Speed(spd);
        return speed;
    }
}
