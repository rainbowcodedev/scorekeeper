package com.example.android.scorekeeper;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Packers
    int scorePackers = 0;
    //Tracks the score for Broncos
    int scoreBroncos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Packers by 6 points.
     */
    public void addSixForPackers(View v) {
        scorePackers = scorePackers + 6;
        displayForPackers(scorePackers);
    }

    /**
     * Increase the score for Packers by 1 point.
     */
    public void addOneForPackers(View v) {
        scorePackers = scorePackers + 1;
        displayForPackers(scorePackers);
    }

    /**
     * Increase the score for Packers by 2 points.
     */
    public void addTwoForPackers(View v) {
        scorePackers = scorePackers + 2;
        displayForPackers(scorePackers);
    }

    /**
     * Increase the score for Packers by 3 points.
     */
    public void addThreeForPackers(View v) {
        scorePackers = scorePackers + 3;
        displayForPackers(scorePackers);
    }

    /**
     * Increase the score for Broncos by 6 points.
     */
    public void addSixForBroncos(View v) {
        scoreBroncos = scoreBroncos + 6;
        displayForBroncos(scoreBroncos);
    }

    /**
     * Increase the score for Broncos by 1 point.
     */
    public void addOneForBroncos(View v) {
        scoreBroncos = scoreBroncos + 1;
        displayForBroncos(scoreBroncos);
    }

    /**
     * Increase the score for Broncos by 2 points.
     */
    public void addTwoForBroncos(View v) {
        scoreBroncos = scoreBroncos + 2;
        displayForBroncos(scoreBroncos);
    }

    /**
     * Increase the score for Broncos by 3 points.
     */
    public void addThreeForBroncos(View v) {
        scoreBroncos = scoreBroncos + 3;
        displayForBroncos(scoreBroncos);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scorePackers = 0;
        scoreBroncos = 0;
        displayForPackers(scorePackers);
        displayForBroncos(scoreBroncos);
    }

    /**
     * Displays the given score for Packers.
     */
    public void displayForPackers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.packers_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Broncos.
     */
    public void displayForBroncos(int score) {
        TextView scoreView = (TextView) findViewById(R.id.broncos_score);
        scoreView.setText(String.valueOf(score));
    }
}