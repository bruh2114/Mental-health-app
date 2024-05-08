package com.group.flatline;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MentalHealthMythsStartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health_myths_starting_screen);

        Button backbtn = findViewById(R.id.button_back);
        backbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MentalHealthMythsStartingScreen.this,MainSelfEvaluationActivity.class);
            startActivity(intent);
        });

        Button buttonStartEvaluation = findViewById(R.id.button_start_evaluation);
        buttonStartEvaluation.setOnClickListener(view -> startEvaluation());
    }

    private void startEvaluation() {
        Uri uri = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdJkuEM5umrMf0Wrn5VlE0b5LoRkSmG2waEmdMUKGAJQ2yj9A/formResponse"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}