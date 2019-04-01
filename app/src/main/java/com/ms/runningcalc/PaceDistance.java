package com.ms.runningcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ms.runningcalc.logic.Calculations;
import com.ms.runningcalc.units.Distance;
import com.ms.runningcalc.units.Pace;
import com.ms.runningcalc.units.Speed;
import com.ms.runningcalc.units.Time;

public class PaceDistance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pace_distance);
    }

    public void calc(View view) {
        EditText distanceText = (EditText) findViewById(R.id.editText);
        EditText paceText = (EditText) findViewById(R.id.editText6);

        float dst = Float.valueOf(distanceText.getText().toString());
        Distance distance = new Distance(dst);

        String tm = paceText.getText().toString();

        int tmp1 = (Character.getNumericValue(tm.charAt(0)));
        int tmp2 = (Character.getNumericValue(tm.charAt(2))*10) + Character.getNumericValue(tm.charAt(3));

        Pace pace = new Pace(tmp1, tmp2);

        int secPace = pace.getSecondsPace();
        int minPace = pace.getMinutesPace();

        int paceSeconds = minPace*60+secPace;

        int timeSec = paceSeconds * (int)distance.getKilometers();

        Time tmpTime = new Time(timeSec);

        //TODO refactor

        EditText timeText = (EditText) findViewById(R.id.editText7);
        EditText speedText = (EditText) findViewById(R.id.editText8);


        Speed calcedSpeed = Calculations.calcSpeed(tmpTime ,distance);

        timeText.setText(tmpTime.getTime());
        speedText.setText(String.valueOf(calcedSpeed.getKmh()));
    }

}
