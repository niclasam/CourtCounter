package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreTeamA += score;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void incrementTeamA3(View view) {
        displayForTeamA(3);
    }

    /**
     * This method is called when the 2 point button is clicked.
     */
    public void incrementTeamA2(View view) {
        displayForTeamA(2);
    }

    /**
     * This method is called when the free throw button is clicked.
     */
    public void incrementTeamA1(View view) {
        displayForTeamA(1);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        scoreTeamB += score;
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void incrementTeamB3(View view) {
        displayForTeamB(3);
    }

    /**
     * This method is called when the 2 point button is clicked.
     */
    public void incrementTeamB2(View view) {
        displayForTeamB(2);
    }

    /**
     * This method is called when the free throw button is clicked.
     */
    public void incrementTeamB1(View view) {
        displayForTeamB(1);
    }

    /**
     * This method is called when the free throw button is clicked.
     */
    public void reset(View view) {
        scoreTeamA= 0;
        scoreTeamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
