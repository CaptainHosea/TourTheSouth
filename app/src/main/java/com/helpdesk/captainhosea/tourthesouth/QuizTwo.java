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

public class QuizTwo extends AppCompatActivity {

    public static RadioGroup radio_group2;
    public static RadioButton radio_btn2;
    public static Button submit2;

    MainActivity ma = new MainActivity();
    QuizOne q1 = new QuizOne();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_two);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_group2 = (RadioGroup) findViewById(R.id.radio_grp2);
        submit2 = (Button) findViewById(R.id.btn_quiz_two);

        submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_group2.getCheckedRadioButtonId();
                radio_btn2 = (RadioButton) findViewById(selected_id);

                if (radio_btn2.getText().toString().equalsIgnoreCase("Johannesburg")) {
                    TextView txt = (TextView) findViewById(R.id.question2);
                    txt.setTextColor(Color.GREEN);
                    Toast.makeText(QuizTwo.this, "Well done, let's move on", Toast.LENGTH_SHORT).show();

                    Button btn = (Button) findViewById(R.id.btn_quiz_two);
                    btn.setText("NEXT >>");

                    ma.setTotalRight(1);



                    TextView txt1 = (TextView) findViewById(R.id.score_correct2);
                    txt1.setText(String.valueOf(ma.getTotalRight()));
                    txt1.setTextColor(Color.GREEN);

                    Button Play = (Button) findViewById(R.id.btn_quiz_two);
                    Play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(QuizTwo.this, QuizThree.class);
                            startActivity(intent);
                        }
                    });

                } else {
                    TextView txt = (TextView) findViewById(R.id.question2);
                    txt.setTextColor(Color.RED);
                    Toast.makeText(QuizTwo.this, "Wrong answer, keep trying", Toast.LENGTH_SHORT).show();

                    ma.setTotalWrong(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_wrong2);
                    txt1.setText(String.valueOf(ma.getTotalWrong()));
                    txt.setTextColor(Color.RED);
                }

            }
        });
    }
}
