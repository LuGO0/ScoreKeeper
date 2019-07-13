package com.example.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * increment score +3
     * */
    public void addThreeForTeamA(View view)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * displays the current score for team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

        /**
         * displays the current score for team A
         */

    public void addThreeForTeamB(View view)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score){
        TextView scoreView=(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetBoth(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
