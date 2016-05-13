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

public class QuizFive extends AppCompatActivity {

    public static RadioGroup radio_group5;
    public static RadioButton radio_btn5;
    public static Button submit5;

    MainActivity ma = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_five);
        onClickListenerButton();
    }

    public void onClickListenerButton(){
        radio_group5 = (RadioGroup) findViewById(R.id.radio_grp5);
        submit5 = (Button) findViewById(R.id.btn_quiz_five);

        submit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = radio_group5.getCheckedRadioButtonId();
                radio_btn5 = (RadioButton) findViewById(selected_id);

                if (radio_btn5.getText().toString().equalsIgnoreCase("Venetia")) {
                    TextView txt = (TextView) findViewById(R.id.question5);
                    txt.setTextColor(Color.GREEN);
                    Toast.makeText(QuizFive.this, "Well done, let's move on", Toast.LENGTH_SHORT).show();

                    Button btn = (Button) findViewById(R.id.btn_quiz_five);
                    btn.setText("NEXT >>");

                    ma.setTotalRight(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_correct5);
                    txt1.setText(String.valueOf(ma.getTotalRight()));
                    txt1.setTextColor(Color.GREEN);

                    Button Play = (Button) findViewById(R.id.btn_quiz_five);
                    Play.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(QuizFive.this, TheEnd.class);
                            startActivity(intent);
                        }
                    });

                } else {
                    TextView txt = (TextView) findViewById(R.id.question5);
                    txt.setTextColor(Color.RED);
                    Toast.makeText(QuizFive.this, "Wrong answer, keep trying", Toast.LENGTH_SHORT).show();

                    ma.setTotalWrong(1);

                    TextView txt1 = (TextView) findViewById(R.id.score_wrong5);
                    txt1.setText(String.valueOf(ma.getTotalWrong()));
                    txt.setTextColor(Color.RED);
                }

            }
        });
    }
}
