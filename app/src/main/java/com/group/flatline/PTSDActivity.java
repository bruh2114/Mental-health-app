package com.group.flatline;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Objects;

public class PTSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsdactivity);

        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.white));

        SharedPreferences preferences = getSharedPreferences("intro", MODE_PRIVATE);
        String intro = preferences.getString("state", "");

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent;
            if (intro.equals("done")) {
                intent = new Intent(getApplicationContext(), MainSelfEvaluationActivity.class);
            } else {
                intent = new Intent(getApplicationContext(), PTSDStartingScreen.class);
            }
            startActivity(intent);
            finish();
        }, 3000);
    }
}