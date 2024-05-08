package com.group.flatline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager = findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);

        mViewPager.setAdapter(adapterView);

        Button evaluationbtn = findViewById(R.id.evaluation);
        evaluationbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainSelfEvaluationActivity.class);
            startActivity(intent);
        });
        Button journalingbtn = findViewById(R.id.journaling);
        journalingbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivityJournal.class);
            startActivity(intent);
        });
        Button locationbtn = findViewById(R.id.location);
        locationbtn.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity.this, MapTrack.class);
            startActivity(intent);
        });
        Button musicbtn = findViewById(R.id.music);
        musicbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MusicPlayerMainActivity.class);
            startActivity(intent);
        });
        Button statsbtn = findViewById(R.id.stats);
        statsbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, StatisticsMainActivity.class);
            startActivity(intent);
        });
        Button breathingbtn = findViewById(R.id.breath);
        breathingbtn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BreathingTimerActivity.class);
            startActivity(intent);
        });
    }
}