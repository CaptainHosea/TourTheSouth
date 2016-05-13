package com.helpdesk.captainhosea.tourthesouth;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int sumRight = 0;
    int sumWrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Play = (Button) findViewById(R.id.btn_play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuizOne.class);
                startActivity(intent);
            }
        });

        TextView howTxt = (TextView) findViewById(R.id.how_to_play);
        howTxt.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HowToPlay.class);
                startActivity(intent);
            }
        });

        TextView aboutTxt = (TextView) findViewById(R.id.about_the_game);
        aboutTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutTheGame.class);
                startActivity(intent);
            }
        });
    }

//Testing
    
  /*  public void setTotalRight(int num){

        sumRight += num;
    }

    public void setTotalWrong(int num) {

        sumWrong += num;
    }

    public int getTotalRight() {

        return sumRight;
    }
    public int getTotalWrong(){

        return sumWrong;*/

       /* ViewPager pager = (ViewPager)findViewById(R.id.pager);
        SliderAdapter adapter= new SliderAdapter(this.getSupportFragmentManager());

        pager.setAdapter(adapter);*/
    }











