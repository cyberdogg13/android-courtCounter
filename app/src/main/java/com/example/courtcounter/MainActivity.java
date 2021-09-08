package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add1 (View view) {
        teamAScore = teamAScore+1;
        displayForTeamA(teamAScore);
    }

    public void add2 (View view) {
        teamAScore = teamAScore+2;
        displayForTeamA(teamAScore);
    }

    public void add3 (View view) {
        teamAScore = teamAScore+3;
        displayForTeamA(teamAScore);
    }

}