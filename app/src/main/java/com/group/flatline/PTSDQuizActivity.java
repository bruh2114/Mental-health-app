package com.group.flatline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PTSDQuizActivity extends AppCompatActivity {

    int Re_dx = 0;
    int Av_dx = 0;
    int Th_dx = 0;
    int PTSDFI = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsdquiz);

        RadioGroup Question1 = findViewById(R.id.P1answers);
        Question1.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P1A1) {
                getRe_dx(0);
            } else if (checkedId == R.id.P1A2) {
                getRe_dx(1);
            } else if (checkedId == R.id.P1A3) {
                getRe_dx(2);
            } else if (checkedId == R.id.P1A4) {
                getRe_dx(3);
            } else {
                getRe_dx(4);
            }
        });
        RadioGroup Question2 = findViewById(R.id.P2answers);
        Question2.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P2A1){
                getRe_dx(0);
            } else if (checkedId == R.id.P2A2){
                getRe_dx(1);
            } else if (checkedId == R.id.P2A3){
                getRe_dx(2);
            } else if (checkedId == R.id.P2A4){
                getRe_dx(3);
            } else {
                getRe_dx(4);
            }
        });
        RadioGroup Question3 = findViewById(R.id.P3answers);
        Question3.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P3A1){
                getAv_dx(0);
            } else if (checkedId == R.id.P3A2){
                getAv_dx(1);
            } else if (checkedId == R.id.P3A3){
                getAv_dx(2);
            } else if (checkedId == R.id.P3A4){
                getAv_dx(3);
            } else {
                getAv_dx(4);
            }
        });
        RadioGroup Question4 = findViewById(R.id.P4answers);
        Question4.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P4A1){
                getAv_dx(0);
            } else if (checkedId == R.id.P4A2){
                getAv_dx(1);
            } else if (checkedId == R.id.P4A3){
                getAv_dx(2);
            } else if (checkedId == R.id.P4A4){
                getAv_dx(3);
            } else {
                getAv_dx(4);
            }
        });
        RadioGroup Question5 = findViewById(R.id.P5answers);
        Question5.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P5A1){
                getTh_dx(0);
            } else if (checkedId == R.id.P5A2){
                getTh_dx(1);
            } else if (checkedId == R.id.P5A3){
                getTh_dx(2);
            } else if (checkedId == R.id.P5A4){
                getTh_dx(3);
            } else {
                getTh_dx(4);
            }
        });
        RadioGroup Question6 = findViewById(R.id.P6answers);
        Question6.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P6A1){
                getTh_dx(0);
            } else if (checkedId == R.id.P6A2){
                getTh_dx(1);
            } else if (checkedId == R.id.P6A3){
                getTh_dx(2);
            } else if (checkedId == R.id.P6A4){
                getTh_dx(3);
            } else {
                getTh_dx(4);
            }
        });
        RadioGroup Question7 = findViewById(R.id.P7answers);
        Question7.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P7A1){
                getPTSDFI(0);
            } else if (checkedId == R.id.P7A2){
                getPTSDFI(1);
            } else if (checkedId == R.id.P7A3){
                getPTSDFI(2);
            } else if (checkedId == R.id.P7A4){
                getPTSDFI(3);
            } else {
                getPTSDFI(4);
            }
        });
        RadioGroup Question8 = findViewById(R.id.P8answers);
        Question8.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P8A1){
                getPTSDFI(0);
            } else if (checkedId == R.id.P8A2){
                getPTSDFI(1);
            } else if (checkedId == R.id.P8A3){
                getPTSDFI(2);
            } else if (checkedId == R.id.P8A4){
                getPTSDFI(3);
            } else {
                getPTSDFI(4);
            }
        });
        RadioGroup Question9 = findViewById(R.id.P9answers);
        Question9.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.P9A1){
                getPTSDFI(0);
            } else if (checkedId == R.id.P9A2){
                getPTSDFI(1);
            } else if (checkedId == R.id.P9A3){
                getPTSDFI(2);
            } else if (checkedId == R.id.P9A4){
                getPTSDFI(3);
            } else {
                getPTSDFI(4);
            }
        });
        Button submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(view -> {
            if (Re_dx >= 2) {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "Re-experiencing in the here and now have been met", Toast.LENGTH_LONG).show();
            } else if (Av_dx >= 2) {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "Avoidance has been met", Toast.LENGTH_LONG).show();
            } else if (Th_dx >= 2) {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "Sense of current threat have been met", Toast.LENGTH_LONG).show();
            } else if (PTSDFI >= 2) {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "PTSD functional impairment have been met", Toast.LENGTH_LONG).show();
            } else if (Re_dx>=2 && Av_dx>=2 && Th_dx>=2 && PTSDFI>=2) {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "You have PTSD", Toast.LENGTH_LONG).show();
            } else
            {
                Intent intent = new Intent(PTSDQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(PTSDQuizActivity.this, "You don't have PTSD", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void getRe_dx(int re_dx){
        Re_dx += re_dx;
    }
    private void getAv_dx(int av_dx){
        Av_dx += av_dx;
    }
    private void getTh_dx(int th_dx){
        Th_dx += th_dx;
    }
    private void getPTSDFI(int ptsdfi){
        PTSDFI += ptsdfi;
    }
}