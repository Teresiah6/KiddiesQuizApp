package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question1Activity extends AppCompatActivity {
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Next = findViewById(R.id.btn_next);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question1Activity.this, Question2Activity.class);
                startActivity(intent);

            }
        });
    }
    public  void onRadioButtonClicked (View view){
        RadioButton whiteRadioButton = findViewById(R.id.white_radiobutton);
        boolean isWhite = whiteRadioButton.isChecked();
        RadioButton blueRadioButton = findViewById(R.id.blue_radiobutton);
        boolean isBlue = blueRadioButton.isChecked();
        RadioButton greenRadioButton = findViewById(R.id.green_radiobutton);
        boolean isGreen = greenRadioButton.isChecked();
        RadioButton yellowRadioButton =  findViewById(R.id.yellow_radiobutton);
        boolean isYellow = yellowRadioButton.isChecked();
        if (isWhite) {
            Toast.makeText(this, "Good job", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Wrong, Try Again",Toast.LENGTH_SHORT).show();
        }

    }


}


