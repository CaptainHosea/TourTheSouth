package com.helpdesk.captainhosea.tourthesouth;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuizOne extends AppCompatActivity {

    public static RadioGroup radio_group1;
    public static RadioButton radio_btn1;
    public static Button submit1;

    MainActivity ma = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_group1 = (RadioGroup) findViewById(R.id.radio_grp1);
        submit1 = (Button) findViewById(R.id.btn_quiz_one);

        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_group1.getCheckedRadioButtonId();
                radio_btn1 = (RadioButton) findViewById(selected_id);


                if (radio_btn1.getText().toString().equalsIgnoreCase("11")) {
                    TextView txt = (TextView) findViewById(R.id.question1);
                    txt.setTextColor(Color.GREEN);
                    Toast.makeText(QuizOne.this, "Well done, let's move on", Toast.LENGTH_SHORT).show();

                    Button btn = (Button) findViewById(R.id.btn_quiz_one);
                    btn.setText("NEXT >>");

                    ma.setTotalRight(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_correct1);
                    txt1.setText(String.valueOf(ma.getTotalRight()));
                    txt1.setTextColor(Color.GREEN);



                    Button Play = (Button) findViewById(R.id.btn_quiz_one);
                    Play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(QuizOne.this, QuizTwo.class);
                            startActivity(intent);
                        }
                    });

                } else {
                    TextView txt = (TextView) findViewById(R.id.question1);
                    txt.setTextColor(Color.RED);
                    Toast.makeText(QuizOne.this, "Wrong answer, keep trying", Toast.LENGTH_SHORT).show();

                    ma.setTotalWrong(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_wrong1);
                    txt1.setText(String.valueOf(ma.getTotalWrong()));
                    txt.setTextColor(Color.RED);
                }

            }
        });
    }

}
