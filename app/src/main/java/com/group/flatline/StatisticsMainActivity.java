package com.group.flatline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StatisticsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_main);

        findViewById(R.id.buttonBarChart).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), BarChartActivity.class)));

        findViewById(R.id.buttonPieChart).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), PieChartActivity.class)));
        findViewById(R.id.buttonMainMenu).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }
}