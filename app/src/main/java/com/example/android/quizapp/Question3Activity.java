package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question3Activity extends AppCompatActivity {
Button next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        next3 = findViewById(R.id.btn_next3);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question3Activity.this,Question4Activity.class);
                startActivity(intent);
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        RadioButton whiteRadioButton = findViewById(R.id.white_radiobutton);
        boolean isWhite = whiteRadioButton.isChecked();
        RadioButton blueRadioButton = findViewById(R.id.blue_radiobutton);
        boolean isBlue = blueRadioButton.isChecked();
        RadioButton greenRadioButton = findViewById(R.id.green_radiobutton);
        boolean isGreen = greenRadioButton.isChecked();
        RadioButton yellowRadioButton = findViewById(R.id.yellow_radiobutton);
        boolean isYellow = yellowRadioButton.isChecked();
        if (isBlue) {
            Toast.makeText(this, "Good job", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong, Try Again", Toast.LENGTH_SHORT).show();
        }
    }

}
