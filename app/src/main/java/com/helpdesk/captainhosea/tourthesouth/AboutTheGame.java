package com.helpdesk.captainhosea.tourthesouth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutTheGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_game);

        String AboutTheGame="The game is designed to impart more knowledge about South Africa to anybody who wishes to know.\n";
        AboutTheGame+="\nSouth Africa is a county with many things waiting to be discovered and some of them experienced.\n";
        AboutTheGame+="\nThis is not just some other everyday ordinary App that feeds people information about a particular place, NO.\n";
        AboutTheGame+="\nIt allows a user to learn and at the same time be entertained. Edutainment is what makes this App stand out from the rest";

        TextView displayTxt = (TextView) findViewById(R.id.display_about_text);
        displayTxt.setText(AboutTheGame);
    }
}
