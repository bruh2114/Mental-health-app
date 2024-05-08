package com.group.flatline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnxietyPanicQuizActivity extends AppCompatActivity {
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_panic_quiz);

        RadioGroup q1 = findViewById(R.id.radioq1);
        q1.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q1r1){
                getScore(0);
            } else if (checkedId == R.id.q1r2) {
                getScore(1);
            } else if (checkedId == R.id.q1r3) {
                getScore(2);
            } else if (checkedId == R.id.q1r4) {
                getScore(3);
            } else if (checkedId == R.id.q1r5) {
                getScore(4);
            }
        });
        RadioGroup q2 = findViewById(R.id.radioq2);
        q2.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q2r1){
                getScore(0);
            } else if (checkedId == R.id.q2r2) {
                getScore(1);
            } else if (checkedId == R.id.q2r3) {
                getScore(2);
            } else if (checkedId == R.id.q2r4) {
                getScore(3);
            } else if (checkedId == R.id.q2r5) {
                getScore(4);
            }
        });
        RadioGroup q3 = findViewById(R.id.radioq3);
        q3.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q3r1){
                getScore(0);
            } else if (checkedId == R.id.q3r2) {
                getScore(1);
            } else if (checkedId == R.id.q3r3) {
                getScore(2);
            } else if (checkedId == R.id.q3r4) {
                getScore(3);
            } else if (checkedId == R.id.q3r5) {
                getScore(4);
            }
        });
        RadioGroup q4 = findViewById(R.id.radioq4);
        q4.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q4r1){
                getScore(0);
            } else if (checkedId == R.id.q4r2) {
                getScore(1);
            } else if (checkedId == R.id.q4r3) {
                getScore(2);
            } else if (checkedId == R.id.q4r4) {
                getScore(3);
            } else if (checkedId == R.id.q4r5) {
                getScore(4);
            }
        });
        RadioGroup q5 = findViewById(R.id.radioq5);
        q5.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q5r1){
                getScore(0);
            } else if (checkedId == R.id.q5r2) {
                getScore(1);
            } else if (checkedId == R.id.q5r3) {
                getScore(2);
            } else if (checkedId == R.id.q5r4) {
                getScore(3);
            } else if (checkedId == R.id.q5r5) {
                getScore(4);
            }
        });
        RadioGroup q6 = findViewById(R.id.radioq6);
        q6.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q6r1){
                getScore(0);
            } else if (checkedId == R.id.q6r2) {
                getScore(1);
            } else if (checkedId == R.id.q6r3) {
                getScore(2);
            } else if (checkedId == R.id.q6r4) {
                getScore(3);
            } else if (checkedId == R.id.q6r5) {
                getScore(4);
            }
        });
        RadioGroup q7 = findViewById(R.id.radioq7);
        q7.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q7r1){
                getScore(0);
            } else if (checkedId == R.id.q7r2) {
                getScore(1);
            } else if (checkedId == R.id.q7r3) {
                getScore(2);
            } else if (checkedId == R.id.q7r4) {
                getScore(3);
            } else if (checkedId == R.id.q7r5) {
                getScore(4);
            }
        });
        RadioGroup q8 = findViewById(R.id.radioq8);
        q8.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q8r1){
                getScore(0);
            } else if (checkedId == R.id.q8r2) {
                getScore(1);
            } else if (checkedId == R.id.q8r3) {
                getScore(2);
            } else if (checkedId == R.id.q8r4) {
                getScore(3);
            } else if (checkedId == R.id.q8r5){
                getScore(4);
            }
        });
        RadioGroup q9 = findViewById(R.id.radioq9);
        q9.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q9r1){
                getScore(0);
            } else if (checkedId == R.id.q9r2) {
                getScore(1);
            } else if (checkedId == R.id.q9r3) {
                getScore(2);
            } else if (checkedId == R.id.q9r4) {
                getScore(3);
            } else if (checkedId == R.id.q9r5) {
                getScore(4);
            }
        });
        RadioGroup q10 = findViewById(R.id.radioq10);
        q10.setOnCheckedChangeListener((view, checkedId) ->{
            if (checkedId == R.id.q10r1){
                getScore(0);
            } else if (checkedId == R.id.q10r2) {
                getScore(1);
            } else if (checkedId == R.id.q10r3) {
                getScore(2);
            } else if (checkedId == R.id.q10r4) {
                getScore(3);
            } else if (checkedId == R.id.q10r5) {
                getScore(4);
            }
        });
        Button submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(v -> {
            if (score <=8) {
                Intent intent = new Intent(AnxietyPanicQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(AnxietyPanicQuizActivity.this, "You have MINIMAL ANXIETY", Toast.LENGTH_LONG).show();
            } else if (score >8 && score <= 16) {
                Intent intent = new Intent(AnxietyPanicQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(AnxietyPanicQuizActivity.this, "You have MILD ANXIETY", Toast.LENGTH_LONG).show();
            } else if (score >= 17 && score <= 24) {
                Intent intent = new Intent(AnxietyPanicQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(AnxietyPanicQuizActivity.this, "You have MODERATE ANXIETY", Toast.LENGTH_LONG).show();
            } else if (score >= 25 && score <= 40) {
                Intent intent = new Intent(AnxietyPanicQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(AnxietyPanicQuizActivity.this, "You have HIGH ANXIETY (Warning Level)", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(AnxietyPanicQuizActivity.this,MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(AnxietyPanicQuizActivity.this, "You have EXTREME ANXIETY (Warning Level)", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void getScore(int i) {
        score += i;
    }
}