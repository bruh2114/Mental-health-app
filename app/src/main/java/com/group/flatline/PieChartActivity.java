package com.group.flatline;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);
        PieChart pieChart1 = findViewById(R.id.pieChart1);
        PieChart pieChart2 = findViewById(R.id.pieChart2);
        PieChart pieChart3 = findViewById(R.id.pieChart3);
        PieChart pieChart4 = findViewById(R.id.pieChart4);
        PieChart pieChart5 = findViewById(R.id.pieChart5);
        PieChart pieChart6 = findViewById(R.id.pieChart6);
        PieChart pieChart7 = findViewById(R.id.pieChart7);
        PieChart pieChart8 = findViewById(R.id.pieChart8);
        PieChart pieChart9 = findViewById(R.id.pieChart9);
        PieChart pieChart10 = findViewById(R.id.pieChart10);
        PieChart pieChart11 = findViewById(R.id.pieChart11);
        PieChart pieChart12 = findViewById(R.id.pieChart12);
        PieChart pieChart13 = findViewById(R.id.pieChart13);
        PieChart pieChart14 = findViewById(R.id.pieChart14);
        PieChart pieChart15 = findViewById(R.id.pieChart15);
        PieChart pieChart16 = findViewById(R.id.pieChart16);
        PieChart pieChart17 = findViewById(R.id.pieChart17);
        PieChart pieChart18 = findViewById(R.id.pieChart18);
        PieChart pieChart19 = findViewById(R.id.pieChart19);
        PieChart pieChart20 = findViewById(R.id.pieChart20);
        PieChart pieChart21 = findViewById(R.id.pieChart21);
        PieChart pieChart22 = findViewById(R.id.pieChart22);
        PieChart pieChart23 = findViewById(R.id.pieChart23);
        PieChart pieChart24 = findViewById(R.id.pieChart24);
        PieChart pieChart25 = findViewById(R.id.pieChart25);
        PieChart pieChart26 = findViewById(R.id.pieChart26);


        ArrayList<PieEntry> gender = new ArrayList<>();
        gender.add(new PieEntry(91,"Female"));
        gender.add(new PieEntry(27,"Male"));
        gender.add(new PieEntry(1,"Prefer not to say"));
        gender.add(new PieEntry(3,"Other"));

        PieDataSet pieDataSet =new PieDataSet(gender, "Gender");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16F);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Gender");
        pieChart.animate();


        ArrayList<PieEntry> physicalHealth = new ArrayList<>();
        physicalHealth.add(new PieEntry(15,"Excellent"));
        physicalHealth.add(new PieEntry(63,"Average"));
        physicalHealth.add(new PieEntry(27,"Somewhat poor"));
        physicalHealth.add(new PieEntry(11,"Poor"));
        physicalHealth.add(new PieEntry(5,"Not sure"));

        PieDataSet pieDataSet1 =new PieDataSet(physicalHealth, "Physical health");
        pieDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet1.setValueTextColor(Color.BLACK);
        pieDataSet1.setValueTextSize(16F);

        PieData pieData1 = new PieData(pieDataSet1);

        pieChart1.setData(pieData1);
        pieChart1.getDescription().setEnabled(false);
        pieChart1.setCenterText("Physical health");
        pieChart1.animate();



        ArrayList<PieEntry> mentalHealth = new ArrayList<>();
        mentalHealth.add(new PieEntry(8,"Excellent"));
        mentalHealth.add(new PieEntry(26,"Somewhat good"));
        mentalHealth.add(new PieEntry(40,"Average"));
        mentalHealth.add(new PieEntry(19,"Somewhat poor"));
        mentalHealth.add(new PieEntry(19,"Poor"));
        mentalHealth.add(new PieEntry(10,"Not sure"));

        PieDataSet pieDataSet2 =new PieDataSet(mentalHealth, "Mental health");
        pieDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet2.setValueTextColor(Color.BLACK);
        pieDataSet2.setValueTextSize(16F);

        PieData pieData2 = new PieData(pieDataSet2);

        pieChart2.setData(pieData2);
        pieChart2.getDescription().setEnabled(false);
        pieChart2.setCenterText("Mental health");
        pieChart2.animate();

        ArrayList<PieEntry> physicalHealthIssues = new ArrayList<>();
        physicalHealthIssues.add(new PieEntry(43,"Yes"));
        physicalHealthIssues.add(new PieEntry(63,"No"));
        physicalHealthIssues.add(new PieEntry(15,"Not sure"));

        PieDataSet pieDataSet3 =new PieDataSet(physicalHealthIssues, "Physical health issues");
        pieDataSet3.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet3.setValueTextColor(Color.BLACK);
        pieDataSet3.setValueTextSize(16F);

        PieData pieData3 = new PieData(pieDataSet3);

        pieChart3.setData(pieData3);
        pieChart3.getDescription().setEnabled(false);
        pieChart3.setCenterText("Physical health rating");
        pieChart3.animate();

        ArrayList<PieEntry> mentalHealthIssues = new ArrayList<>();
        mentalHealthIssues.add(new PieEntry(15,"Excellent"));
        mentalHealthIssues.add(new PieEntry(63,"Average"));
        mentalHealthIssues.add(new PieEntry(27,"Somewhat poor"));

        PieDataSet pieDataSet4 =new PieDataSet(mentalHealthIssues, "Physical health");
        pieDataSet4.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet4.setValueTextColor(Color.BLACK);
        pieDataSet4.setValueTextSize(16F);

        PieData pieData4 = new PieData(pieDataSet4);

        pieChart4.setData(pieData4);
        pieChart4.getDescription().setEnabled(false);
        pieChart4.setCenterText("Mental health rating");
        pieChart4.animate();

        ArrayList<PieEntry> physicalWork = new ArrayList<>();
        physicalWork.add(new PieEntry(15,"Excellent"));
        physicalWork.add(new PieEntry(63,"Average"));
        physicalWork.add(new PieEntry(27,"Somewhat poor"));


        PieDataSet pieDataSet5 =new PieDataSet(physicalWork, "Problem caused by physical health");
        pieDataSet5.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet5.setValueTextColor(Color.BLACK);
        pieDataSet5.setValueTextSize(16F);

        PieData pieData5 = new PieData(pieDataSet5);

        pieChart5.setData(pieData5);
        pieChart5.getDescription().setEnabled(false);
        pieChart5.setCenterText("Problem due to physical health");
        pieChart5.animate();

        ArrayList<PieEntry> mentalWork = new ArrayList<>();
        mentalWork.add(new PieEntry(85,"Yes"));
        mentalWork.add(new PieEntry(28,"No"));
        mentalWork.add(new PieEntry(9,"Not sure"));


        PieDataSet pieDataSet6 =new PieDataSet(mentalWork, "mentalWork");
        pieDataSet6.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet6.setValueTextColor(Color.BLACK);
        pieDataSet6.setValueTextSize(16F);

        PieData pieData6 = new PieData(pieDataSet6);

        pieChart6.setData(pieData6);
        pieChart6.getDescription().setEnabled(false);
        pieChart6.setCenterText("Problems caused by mental health ");
        pieChart6.animate();

        ArrayList<PieEntry> mentalOccurrence = new ArrayList<>();
        mentalOccurrence.add(new PieEntry(26,"Very often"));
        mentalOccurrence.add(new PieEntry(52,"Somewhat often"));
        mentalOccurrence.add(new PieEntry(27,"Not so often"));
        mentalOccurrence.add(new PieEntry(17,"Not at all"));

        PieDataSet pieDataSet7 =new PieDataSet(mentalOccurrence, "Mental health occurrence rate");
        pieDataSet7.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet7.setValueTextColor(Color.BLACK);
        pieDataSet7.setValueTextSize(16F);

        PieData pieData7 = new PieData(pieDataSet7);

        pieChart7.setData(pieData7);
        pieChart7.getDescription().setEnabled(false);
        pieChart7.setCenterText("Mental problems occurrence rate");
        pieChart7.animate();

        ArrayList<PieEntry> feeling = new ArrayList<>();
        feeling.add(new PieEntry(32,"Very often"));
        feeling.add(new PieEntry(42,"Somewhat often"));
        feeling.add(new PieEntry(33,"Not so often"));
        feeling.add(new PieEntry(15,"Not at all"));

        PieDataSet pieDataSet8 =new PieDataSet(feeling, "Feeling low over 2 weeks");
        pieDataSet8.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet8.setValueTextColor(Color.BLACK);
        pieDataSet8.setValueTextSize(16F);

        PieData pieData8 = new PieData(pieDataSet8);

        pieChart8.setData(pieData8);
        pieChart8.getDescription().setEnabled(false);
        pieChart8.setCenterText("Felt low over two weeks");
        pieChart8.animate();

        ArrayList<PieEntry> mentalHealthRelationship = new ArrayList<>();
        mentalHealthRelationship.add(new PieEntry(21,"Very often"));
        mentalHealthRelationship.add(new PieEntry(38,"Somewhat often"));
        mentalHealthRelationship.add(new PieEntry(37,"Not so often"));
        mentalHealthRelationship.add(new PieEntry(26,"Not at all"));

        PieDataSet pieDataSet9 =new PieDataSet(mentalHealthRelationship, "Mental health affected relationships");
        pieDataSet9.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet9.setValueTextColor(Color.BLACK);
        pieDataSet9.setValueTextSize(16F);

        PieData pieData9 = new PieData(pieDataSet9);

        pieChart9.setData(pieData9);
        pieChart9.getDescription().setEnabled(false);
        pieChart9.setCenterText("Does mental health affect relationships");
        pieChart9.animate();

        ArrayList<PieEntry> calm = new ArrayList<>();
        calm.add(new PieEntry(10,"Never"));
        calm.add(new PieEntry(55,"Once in a while"));
        calm.add(new PieEntry(23,"About half the time"));
        calm.add(new PieEntry(29,"Most of the time"));
        calm.add(new PieEntry(4,"Always"));

        PieDataSet pieDataSet10 =new PieDataSet(calm, "How often do you feel at peace");
        pieDataSet10.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet10.setValueTextColor(Color.BLACK);
        pieDataSet10.setValueTextSize(16F);

        PieData pieData10 = new PieData(pieDataSet10);

        pieChart10.setData(pieData10);
        pieChart10.getDescription().setEnabled(false);
        pieChart10.setCenterText("How often do you feel at peace");
        pieChart10.animate();

        ArrayList<PieEntry> energetic = new ArrayList<>();
        energetic.add(new PieEntry(14,"Never"));
        energetic.add(new PieEntry(52,"Once in a while"));
        energetic.add(new PieEntry(32,"About half the time"));
        energetic.add(new PieEntry(23,"Most of the time"));
        energetic.add(new PieEntry(1,"Always"));

        PieDataSet pieDataSet11 =new PieDataSet(energetic, "How often do you feel energetic");
        pieDataSet11.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet11.setValueTextColor(Color.BLACK);
        pieDataSet11.setValueTextSize(16F);

        PieData pieData11 = new PieData(pieDataSet11);

        pieChart11.setData(pieData11);
        pieChart11.getDescription().setEnabled(false);
        pieChart11.setCenterText("How often do you feel energetic");
        pieChart11.animate();

        ArrayList<PieEntry> gloominess = new ArrayList<>();
        gloominess.add(new PieEntry(10,"Never"));
        gloominess.add(new PieEntry(57,"Once in a while"));
        gloominess.add(new PieEntry(27,"About half the time"));
        gloominess.add(new PieEntry(20,"Most of the time"));
        gloominess.add(new PieEntry(7,"Always"));

        PieDataSet pieDataSet12 =new PieDataSet(gloominess, "Experience gloominess");
        pieDataSet12.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet12.setValueTextColor(Color.BLACK);
        pieDataSet12.setValueTextSize(16F);

        PieData pieData12 = new PieData(pieDataSet12);

        pieChart12.setData(pieData12);
        pieChart12.getDescription().setEnabled(false);
        pieChart12.setCenterText("How often do you experience gloominess");
        pieChart12.animate();

        ArrayList<PieEntry> anger = new ArrayList<>();
        anger.add(new PieEntry(6,"Never"));
        anger.add(new PieEntry(60,"Once in a while"));
        anger.add(new PieEntry(34,"About half the time"));
        anger.add(new PieEntry(13,"Most of the time"));
        anger.add(new PieEntry(9,"Always"));

        PieDataSet pieDataSet13 =new PieDataSet(anger, "Experience anger");
        pieDataSet13.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet13.setValueTextColor(Color.BLACK);
        pieDataSet13.setValueTextSize(16F);

        PieData pieData13 = new PieData(pieDataSet13);

        pieChart13.setData(pieData13);
        pieChart13.getDescription().setEnabled(false);
        pieChart13.setCenterText("How often do you experience anger?");
        pieChart13.animate();

        ArrayList<PieEntry> dietHabits = new ArrayList<>();
        dietHabits.add(new PieEntry(47,"Yes, I eat too much"));
        dietHabits.add(new PieEntry(30,"Yes, I don't feel hungry"));
        dietHabits.add(new PieEntry(30,"Not much"));
        dietHabits.add(new PieEntry(15,"No change"));

        PieDataSet pieDataSet14 =new PieDataSet(dietHabits, "Change in diet habits");
        pieDataSet14.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet14.setValueTextColor(Color.BLACK);
        pieDataSet14.setValueTextSize(16F);

        PieData pieData14 = new PieData(pieDataSet14);

        pieChart14.setData(pieData14);
        pieChart14.getDescription().setEnabled(false);
        pieChart14.setCenterText("Any change in diet?");
        pieChart14.animate();

        ArrayList<PieEntry> happy = new ArrayList<>();
        happy.add(new PieEntry(60,"Few days ago"));
        happy.add(new PieEntry(9,"Few weeks ago"));
        happy.add(new PieEntry(19,"Few months ago"));
        happy.add(new PieEntry(5,"Few years ago"));
        happy.add(new PieEntry(28,"I don't remember"));

        PieDataSet pieDataSet15 =new PieDataSet(happy, "Last time you were happy");
        pieDataSet15.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet15.setValueTextColor(Color.BLACK);
        pieDataSet15.setValueTextSize(16F);

        PieData pieData15 = new PieData(pieDataSet15);

        pieChart15.setData(pieData15);
        pieChart15.getDescription().setEnabled(false);
        pieChart15.setCenterText("Last time you were really happy?");
        pieChart15.animate();

        ArrayList<PieEntry> feltGood = new ArrayList<>();
        feltGood.add(new PieEntry(55,"Few days ago"));
        feltGood.add(new PieEntry(16,"Few weeks ago"));
        feltGood.add(new PieEntry(16,"Few months ago"));
        feltGood.add(new PieEntry(7,"Few years ago"));
        feltGood.add(new PieEntry(27,"I don't remember"));

        PieDataSet pieDataSet16 =new PieDataSet(feltGood, "Felt good");
        pieDataSet16.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet16.setValueTextColor(Color.BLACK);
        pieDataSet16.setValueTextSize(16F);

        PieData pieData16 = new PieData(pieDataSet16);

        pieChart16.setData(pieData16);
        pieChart16.getDescription().setEnabled(false);
        pieChart16.setCenterText("When last did you feel good about yourself?");
        pieChart16.animate();

        ArrayList<PieEntry> feelPositive = new ArrayList<>();
        feelPositive.add(new PieEntry(10,"Never"));
        feelPositive.add(new PieEntry(39,"Once in a while"));
        feelPositive.add(new PieEntry(35,"About half the time"));
        feelPositive.add(new PieEntry(33,"Most of the time"));
        feelPositive.add(new PieEntry(4,"Always"));

        PieDataSet pieDataSet17 =new PieDataSet(feelPositive, "Feel positive");
        pieDataSet17.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet17.setValueTextColor(Color.BLACK);
        pieDataSet17.setValueTextSize(16F);

        PieData pieData17 = new PieData(pieDataSet17);

        pieChart17.setData(pieData17);
        pieChart17.getDescription().setEnabled(false);
        pieChart17.setCenterText("How often do you feel positive?");
        pieChart17.animate();

        ArrayList<PieEntry> positiveOutlook = new ArrayList<>();
        positiveOutlook.add(new PieEntry(59,"Few days ago"));
        positiveOutlook.add(new PieEntry(20,"Few weeks ago"));
        positiveOutlook.add(new PieEntry(18,"Few months ago"));
        positiveOutlook.add(new PieEntry(3,"Few years ago"));
        positiveOutlook.add(new PieEntry(21,"I don't remember"));

        PieDataSet pieDataSet18 =new PieDataSet(positiveOutlook, "Positive outlook on life");
        pieDataSet18.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet18.setValueTextColor(Color.BLACK);
        pieDataSet18.setValueTextSize(16F);

        PieData pieData18 = new PieData(pieDataSet18);

        pieChart18.setData(pieData18);
        pieChart18.getDescription().setEnabled(false);
        pieChart18.setCenterText("When last did you have a positive outlook on life?");
        pieChart18.animate();

        ArrayList<PieEntry> diagnosis = new ArrayList<>();
        diagnosis.add(new PieEntry(26,"Yes"));
        diagnosis.add(new PieEntry(84,"No"));
        diagnosis.add(new PieEntry(12,"Not sure"));


        PieDataSet pieDataSet19 =new PieDataSet(diagnosis, "Mental order diagnosis");
        pieDataSet19.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet19.setValueTextColor(Color.BLACK);
        pieDataSet19.setValueTextSize(16F);

        PieData pieData19 = new PieData(pieDataSet19);

        pieChart19.setData(pieData19);
        pieChart19.getDescription().setEnabled(false);
        pieChart19.setCenterText("Have you ever been diagnosed with a mental disorder?");
        pieChart19.animate();

        ArrayList<PieEntry> mentalExamination = new ArrayList<>();
        mentalExamination.add(new PieEntry(9,"Less than 6 months ago"));
        mentalExamination.add(new PieEntry(2,"6 months ago"));
        mentalExamination.add(new PieEntry(5,"A year ago"));
        mentalExamination.add(new PieEntry(22,"More than a year ago"));
        mentalExamination.add(new PieEntry(84,"Never"));

        PieDataSet pieDataSet20 =new PieDataSet(mentalExamination, "Mental health examination");
        pieDataSet20.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet20.setValueTextColor(Color.BLACK);
        pieDataSet20.setValueTextSize(16F);

        PieData pieData20 = new PieData(pieDataSet20);

        pieChart20.setData(pieData20);
        pieChart20.getDescription().setEnabled(false);
        pieChart20.setCenterText("When last did you get a mental health examination done?");
        pieChart20.animate();

        ArrayList<PieEntry> disorder = new ArrayList<>();
        disorder.add(new PieEntry(22,"Yes"));
        disorder.add(new PieEntry(47,"No"));
        disorder.add(new PieEntry(53,"Not sure"));


        PieDataSet pieDataSet21 =new PieDataSet(disorder, "Mental disorder");
        pieDataSet21.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet21.setValueTextColor(Color.BLACK);
        pieDataSet21.setValueTextSize(16F);

        PieData pieData21 = new PieData(pieDataSet21);

        pieChart21.setData(pieData21);
        pieChart21.getDescription().setEnabled(false);
        pieChart21.setCenterText("Mental disorder within family?");
        pieChart21.animate();

        ArrayList<PieEntry> therapist = new ArrayList<>();
        therapist.add(new PieEntry(28,"Yes"));
        therapist.add(new PieEntry(94,"No"));

        PieDataSet pieDataSet22 =new PieDataSet(therapist, "Therapist");
        pieDataSet22.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet22.setValueTextColor(Color.BLACK);
        pieDataSet22.setValueTextSize(16F);

        PieData pieData22 = new PieData(pieDataSet22);

        pieChart22.setData(pieData22);
        pieChart22.getDescription().setEnabled(false);
        pieChart22.setCenterText("Seen a therapist");
        pieChart22.animate();

        ArrayList<PieEntry> qualitySleep = new ArrayList<>();
        qualitySleep.add(new PieEntry(17,"Very bad"));
        qualitySleep.add(new PieEntry(38,"Bad"));
        qualitySleep.add(new PieEntry(44,"Normal"));
        qualitySleep.add(new PieEntry(13,"Good"));
        qualitySleep.add(new PieEntry(10,"Very good"));

        PieDataSet pieDataSet23 =new PieDataSet(qualitySleep, "Limit in doing moderate physical activities");
        pieDataSet23.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet23.setValueTextColor(Color.BLACK);
        pieDataSet23.setValueTextSize(16F);

        PieData pieData23 = new PieData(pieDataSet23);

        pieChart23.setData(pieData23);
        pieChart23.getDescription().setEnabled(false);
        pieChart23.setCenterText("How is your quality of sleep?");
        pieChart23.animate();

        ArrayList<PieEntry> smoke = new ArrayList<>();
        smoke.add(new PieEntry(22,"Never"));
        smoke.add(new PieEntry(39,"Once in a few weeks"));
        smoke.add(new PieEntry(10,"Once everyday"));
        smoke.add(new PieEntry(50,"More than once everyday"));

        PieDataSet pieDataSet24 =new PieDataSet(smoke, "How often do you smoke");
        pieDataSet24.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet24.setValueTextColor(Color.BLACK);
        pieDataSet24.setValueTextSize(16F);

        PieData pieData24 = new PieData(pieDataSet24);

        pieChart24.setData(pieData24);
        pieChart24.getDescription().setEnabled(false);
        pieChart24.setCenterText("How often do you smoke");
        pieChart24.animate();

        ArrayList<PieEntry> drink = new ArrayList<>();
        drink.add(new PieEntry(22,"Never"));
        drink.add(new PieEntry(39,"Once in a few weeks"));
        drink.add(new PieEntry(10,"Once everyday"));
        drink.add(new PieEntry(50,"More than once everyday"));

        PieDataSet pieDataSet25 =new PieDataSet(drink, "How often do you drink?");
        pieDataSet25.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet25.setValueTextColor(Color.BLACK);
        pieDataSet25.setValueTextSize(16F);

        PieData pieData25 = new PieData(pieDataSet25);

        pieChart25.setData(pieData25);
        pieChart25.getDescription().setEnabled(false);
        pieChart25.setCenterText("How often do you drink?");
        pieChart25.animate();

        ArrayList<PieEntry> emotionalSituation = new ArrayList<>();
        emotionalSituation.add(new PieEntry(65,"Yes"));
        emotionalSituation.add(new PieEntry(55,"No"));

        PieDataSet pieDataSet26 =new PieDataSet(emotionalSituation, "Tough emotional situation");
        pieDataSet26.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet26.setValueTextColor(Color.BLACK);
        pieDataSet26.setValueTextSize(16F);

        PieData pieData26 = new PieData(pieDataSet26);

        pieChart26.setData(pieData26);
        pieChart26.getDescription().setEnabled(false);
        pieChart26.setCenterText("Are you going through a tough emotional situation?");
        pieChart26.animate();

    }
}