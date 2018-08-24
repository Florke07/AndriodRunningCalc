package com.ms.runningcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ms.runningcalc.units.Distance;

public class PaceDistance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pace_distance);
    }

    public void calc(View view) {
        EditText distanceText = (EditText) findViewById(R.id.editText2);
        EditText paceText = (EditText) findViewById(R.id.editText3);

        float dst = Float.valueOf(distanceText.getText().toString());
        Distance distance = new Distance(dst);

        String tm = paceText.getText().toString();

    }

}
