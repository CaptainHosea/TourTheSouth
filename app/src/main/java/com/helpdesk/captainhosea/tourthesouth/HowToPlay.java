package com.helpdesk.captainhosea.tourthesouth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HowToPlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        String howToPlay="You will be given a number of questions to answer. All the questions are in a multiple choice type of setting.\n";
        howToPlay+="\nFor most questions, there are four(4) possible choices, only one of them is correct. Some will have two(2) choices to pick from.\n";
        howToPlay+="\nAfter picking your answer, press on the 'Submit' button to check if you got the answer correct or not.\n";
        howToPlay+="\nIf you get the answer  wrong, the question will change its color to red; If you however get it right, it will turn green and move on.";

        TextView displayTxt = (TextView) findViewById(R.id.display_how_text);
        displayTxt.setText(howToPlay);
    }

}


