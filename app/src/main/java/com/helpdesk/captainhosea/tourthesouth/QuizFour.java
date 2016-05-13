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

public class QuizFour extends AppCompatActivity {

    public static RadioGroup radio_group4;
    public static RadioButton radio_btn4;
    public static Button submit4;

    MainActivity ma = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_group4 = (RadioGroup) findViewById(R.id.radio_grp4);
        submit4 = (Button) findViewById(R.id.btn_quiz_four);

        submit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_group4.getCheckedRadioButtonId();
                radio_btn4 = (RadioButton) findViewById(selected_id);

                if (radio_btn4.getText().toString().equalsIgnoreCase("Carlton Center")) {
                    TextView txt = (TextView) findViewById(R.id.question4);
                    txt.setTextColor(Color.GREEN);
                    Toast.makeText(QuizFour.this, "Well done, let's move on", Toast.LENGTH_SHORT).show();

                    Button btn = (Button) findViewById(R.id.btn_quiz_four);
                    btn.setText("NEXT >>");

                    ma.setTotalRight(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_correct4);
                    txt1.setText(String.valueOf(ma.getTotalRight()));
                    txt1.setTextColor(Color.GREEN);

                    Button Play = (Button) findViewById(R.id.btn_quiz_four);
                    Play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(QuizFour.this, QuizFive.class);
                            startActivity(intent);
                        }
                    });

                } else {
                    TextView txt = (TextView) findViewById(R.id.question4);
                    txt.setTextColor(Color.RED);
                    Toast.makeText(QuizFour.this, "Wrong answer, keep trying", Toast.LENGTH_SHORT).show();

                    ma.setTotalWrong(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_wrong4);
                    txt1.setText(String.valueOf(ma.getTotalWrong()));
                    txt.setTextColor(Color.RED);
                }

            }
        });
    }
}
