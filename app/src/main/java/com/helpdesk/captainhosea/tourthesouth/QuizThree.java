package com.helpdesk.captainhosea.tourthesouth;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizThree extends AppCompatActivity {

    public static RadioGroup radio_group3;
    public static RadioButton radio_btn3;
    public static Button submit3;

    MainActivity ma = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_group3 = (RadioGroup) findViewById(R.id.radio_grp3);
        submit3 = (Button) findViewById(R.id.btn_quiz_three);

        submit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_group3.getCheckedRadioButtonId();
                radio_btn3 = (RadioButton) findViewById(selected_id);

                if (radio_btn3.getText().toString().equalsIgnoreCase("Table Mountain")) {
                    TextView txt = (TextView) findViewById(R.id.question3);
                    txt.setTextColor(Color.GREEN);
                    Toast.makeText(QuizThree.this, "Well done, let's move on", Toast.LENGTH_SHORT).show();

                    Button btn = (Button) findViewById(R.id.btn_quiz_three);
                    btn.setText("NEXT >>");

                    ma.setTotalRight(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_correct3);
                    txt1.setText(String.valueOf(ma.getTotalRight()));
                    txt1.setTextColor(Color.GREEN);

                    Button Play = (Button) findViewById(R.id.btn_quiz_three);
                    Play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(QuizThree.this, QuizFour.class);
                            startActivity(intent);
                        }
                    });

                } else {
                    TextView txt = (TextView) findViewById(R.id.question3);
                    txt.setTextColor(Color.RED);
                    Toast.makeText(QuizThree.this, "Wrong answer, keep trying", Toast.LENGTH_SHORT).show();

                    ma.setTotalWrong(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_wrong3);
                    txt1.setText(String.valueOf(ma.getTotalWrong()));
                    txt.setTextColor(Color.RED);
                }

            }
        });
    }
}
