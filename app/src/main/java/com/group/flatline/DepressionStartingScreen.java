package com.group.flatline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DepressionStartingScreen extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_starting_screen);

        Button buttonStartEvaluation = findViewById(R.id.button_start_evaluation);
        buttonStartEvaluation.setOnClickListener(view -> startEvaluation());
    }

    private void startEvaluation() {
        Intent intent = new Intent(DepressionStartingScreen.this, DepressionQuizActivity.class);
        startActivity(intent);
    }
}