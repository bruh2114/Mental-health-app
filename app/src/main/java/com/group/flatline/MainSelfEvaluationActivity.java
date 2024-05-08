package com.group.flatline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainSelfEvaluationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_self_evaluation);

        findViewById(R.id.depression);
        findViewById(R.id.anxiety_panic);
        findViewById(R.id.mentalhealthmyths);
        findViewById(R.id.ptsd);

        Button DepressionButton = findViewById(R.id.depressionButton);
        Button Anxiety_PanicButton = findViewById(R.id.anxiety_panicButton);
        Button PTSD_Button = findViewById(R.id.ptsdButton);
        Button MentalHealthMythsButton = findViewById(R.id.mentalhealthmythsButton);
        Button MainMenu = findViewById(R.id.main_menu);

        DepressionButton.setOnClickListener(view -> {

            Intent intent = new Intent(MainSelfEvaluationActivity.this, DepressionActivity.class);
            startActivity(intent);
        });
        Anxiety_PanicButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainSelfEvaluationActivity.this, Anxiety_PanicActivity.class);
            startActivity(intent);
        });
        PTSD_Button.setOnClickListener(view -> {
            Intent intent = new Intent(MainSelfEvaluationActivity.this, PTSDActivity.class);
            startActivity(intent);
        });
        MentalHealthMythsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainSelfEvaluationActivity.this, MentalHealthMythsActivity.class);
            startActivity(intent);
        });
        MainMenu.setOnClickListener(view -> {
            Intent intent = new Intent(MainSelfEvaluationActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}