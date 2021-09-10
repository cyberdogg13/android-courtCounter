package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;
    int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore =0;
        teamBScore =0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTeamA (View view) {
        int numb = Integer.parseInt(view.getTag().toString());
        teamAScore = teamAScore+numb;
        displayForTeamA(teamAScore);
    }

    public void addTeamB (View view) {
        int numb = Integer.parseInt(view.getTag().toString());
        teamBScore = teamBScore+numb;
        displayForTeamB(teamBScore);
    }
    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);

        displayForTeamB(teamBScore);
    }
}
