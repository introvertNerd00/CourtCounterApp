package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_A=0;
    int score_B=0;

    public void threepointsForTeamA(View view) {
        score_A=score_A+3;
        displayForTeamA(score_A);
    }
    public void twopointsForTeamA(View view) {
        score_A=score_A+2;
        displayForTeamA(score_A);
    }

    public void FreeThrowForTeamA(View view) {
        score_A=score_A+1;
        displayForTeamA(score_A);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threepointsForTeamB(View view) {
        score_B=score_B+3;
        displayForTeamB(score_B);
    }
    public void twopointsForTeamB(View view) {
        score_B=score_B+2;
        displayForTeamB(score_B);
    }

    public void FreeThrowForTeamB(View view) {
        score_B=score_B+1;
        displayForTeamB(score_B);
    }
    public void Reset(View view) {
        score_B=0;
        score_A=0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);

    }


    public void displayForTeamB(int score_b) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score_b));
    }}


