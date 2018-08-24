package com.ms.runningcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ms.runningcalc.logic.Calculations;
import com.ms.runningcalc.units.Distance;
import com.ms.runningcalc.units.Pace;
import com.ms.runningcalc.units.Speed;
import com.ms.runningcalc.units.Time;

public class TimeDistance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_distance);

        // Get the Intent that started this activity and extract the string
        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
    }

    public void calc(View view) {
        EditText distanceText = (EditText) findViewById(R.id.editText2);
        EditText timeText = (EditText) findViewById(R.id.editText3);

        float dst = Float.valueOf(distanceText.getText().toString());
        Distance distance = new Distance(dst);

        String tm = timeText.getText().toString();
        //todo I know, this is terrible
        int tmp1 = (Character.getNumericValue(tm.charAt(0))*10) + Character.getNumericValue(tm.charAt(1));
        int tmp2 = (Character.getNumericValue(tm.charAt(3))*10)+Character.getNumericValue(tm.charAt(4));
        int tmp3 = (Character.getNumericValue(tm.charAt(6))*10)+Character.getNumericValue(tm.charAt(7));
        Time time = new Time(tmp1, tmp2, tmp3);

        Pace calcedPace = Calculations.calcPace(time, distance);
        Speed clalcedSpeed = Calculations.calcSpeed(time, distance);

        EditText paceText = (EditText) findViewById(R.id.editText4);
        paceText.setText(calcedPace.getPace());

        EditText speedText = (EditText) findViewById(R.id.editText5);
        speedText.setText(String.valueOf(clalcedSpeed.getKmh()));

    }
}
