package com.group.flatline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> age = new ArrayList<>();
        age.add(new BarEntry(0,91));
        age.add(new BarEntry(1,18));
        age.add(new BarEntry(2,6));
        age.add(new BarEntry(3,3));
        age.add(new BarEntry(4,2));
        age.add(new BarEntry(5,1));

        BarDataSet barDataSet = new BarDataSet(age, "Age");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Number of people per age group");
        barChart.animateY(2000);

        ArrayList<String> xAxisLabel = new ArrayList<>();
        xAxisLabel.add("15-24");
        xAxisLabel.add("25-34");
        xAxisLabel.add("35-44");
        xAxisLabel.add("45-54");
        xAxisLabel.add("55-64");
        xAxisLabel.add("65-74");

        barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xAxisLabel));
    }
}