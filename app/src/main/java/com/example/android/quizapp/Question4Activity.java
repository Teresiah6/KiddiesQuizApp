package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }
    public void onRadioButtonClicked(View view) {
        RadioButton whiteRadioButton = findViewById(R.id.white_radiobutton);
        boolean isWhite = whiteRadioButton.isChecked();
        RadioButton brownRadioButton = findViewById(R.id.brown_radiobutton);
        boolean isBrown = brownRadioButton.isChecked();
        RadioButton redRadioButton = findViewById(R.id.red_radiobutton);
        boolean isRed = redRadioButton.isChecked();
        RadioButton yellowRadioButton = findViewById(R.id.yellow_radiobutton);
        boolean isYellow = yellowRadioButton.isChecked();
        if (isBrown) {
            Toast.makeText(this, "Good job", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong, Try Again", Toast.LENGTH_SHORT).show();
        }
    }

}
