package com.group.flatline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DepressionQuizActivity extends AppCompatActivity{
    int score =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_quiz);

        RadioGroup Question1RadioGroup = findViewById(R.id.question1);
        Question1RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes1){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });

        RadioGroup Question2RadioGroup = findViewById(R.id.question2);
        Question2RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes2){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });

        RadioGroup Question3RadioGroup = findViewById(R.id.question3);
        Question3RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes3){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question4RadioGroup = findViewById(R.id.question4);
        Question4RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes4){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question5RadioGroup = findViewById(R.id.question5);
        Question5RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes5){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question6RadioGroup = findViewById(R.id.question6);
        Question6RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes6){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question7RadioGroup = findViewById(R.id.question7);
        Question7RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes7){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question8RadioGroup = findViewById(R.id.question8);
        Question8RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes8){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question9RadioGroup = findViewById(R.id.question9);
        Question9RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes9){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question10RadioGroup = findViewById(R.id.question10);
        Question10RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes10){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question11RadioGroup = findViewById(R.id.question11);
        Question11RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes11){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question12RadioGroup = findViewById(R.id.question12);
        Question12RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes12){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question13RadioGroup = findViewById(R.id.question13);
        Question13RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes13){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question14RadioGroup = findViewById(R.id.question14);
        Question14RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes14){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question15RadioGroup = findViewById(R.id.question15);
        Question15RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes15){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question16RadioGroup = findViewById(R.id.question16);
        Question16RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes16){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question17RadioGroup = findViewById(R.id.question17);
        Question17RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes17){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question18RadioGroup = findViewById(R.id.question18);
        Question18RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes18){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question19RadioGroup = findViewById(R.id.question19);
        Question19RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes19){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question20RadioGroup = findViewById(R.id.question20);
        Question20RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes20){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question21RadioGroup = findViewById(R.id.question21);
        Question21RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes21){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question22RadioGroup = findViewById(R.id.question22);
        Question22RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes22){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question23RadioGroup = findViewById(R.id.question23);
        Question23RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes23){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question24RadioGroup = findViewById(R.id.question24);
        Question24RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes24){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question25RadioGroup = findViewById(R.id.question25);
        Question25RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes25){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question26RadioGroup = findViewById(R.id.question26);
        Question26RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes26){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        RadioGroup Question27RadioGroup = findViewById(R.id.question27);
        Question27RadioGroup.setOnCheckedChangeListener((view, checkedId) -> {
            if (checkedId == R.id.yes27){
                getScore(1);
            }
            else{
                getScore(0);
            }
        });
        Button submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(v -> {
            if(score>3){
                Intent intent = new Intent(DepressionQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
                Toast.makeText(DepressionQuizActivity.this, "You might have Depression. It is advised that you see a medical professional to be properly diagnosed.", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(DepressionQuizActivity.this, MainSelfEvaluationActivity.class);
                startActivity(intent);
            }
        });
    }
    private void getScore(int current_score) {
        score += current_score;
    }
}
