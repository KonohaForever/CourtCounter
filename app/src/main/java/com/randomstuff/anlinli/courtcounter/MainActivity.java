package com.randomstuff.anlinli.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.randomstuff.anlinli.courtcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void add1(View view) {
        scoreTeamA = scoreTeamA + 1;
        displaya(scoreTeamA);

    }


    /**
     * Increase the score for Team A by 2 points.
     */
    public void add2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displaya(scoreTeamA);

    }


    /**
     * Increase the score for Team A by 3 points.
     */
    public void add3(View view) {
        scoreTeamA = scoreTeamA + 3;
        displaya(scoreTeamA);

    }

    public void add6(View view) {
        scoreTeamA = scoreTeamA + 6;
        displaya(scoreTeamA);

    }

    public void add6b(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayb(scoreTeamB);

    }

    public void add3b(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayb(scoreTeamB);

    }

    public void add2b(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayb(scoreTeamB);

    }

    public void add1b(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayb(scoreTeamB);


    }


    /**
     * Displays the given score for Team A.
     */
    public void displaya(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayb(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displaya(scoreTeamA);
        displayb(scoreTeamB);

    }

}
