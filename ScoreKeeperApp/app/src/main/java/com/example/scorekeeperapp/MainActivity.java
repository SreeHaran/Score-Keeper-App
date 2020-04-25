package com.example.scorekeeperapp;

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

    private int Score1 = 0; //score of player 1
    private int Score2 = 0; // score of player2
    /**
     * when PLayer1 Strikes the white .
     */
    public void WhitePlayer1(View v){
        Score1 += 2;
        displayForPlayer1(Score1);
    }

    /**
     * when PLayer1 Strikes the black .
     */
    public void BlackPlayer1(View v){
        Score1 += 1;
        displayForPlayer1(Score1);
    }

    /**
     * when PLayer1 Strikes the Striker .
     */
    public void MinusPlayer1(View v){
        if(Score1 > 1) {
            Score1 -= 2;
            displayForPlayer1(Score1);
        }else {
            Score1 = 0;
            displayForPlayer1(Score1);
        }
    }


    /**
     * when PLayer2 Strikes the white .
     */
    public void WhitePlayer2 (View v){
        Score2 += 2;
        displayForPlayer2(Score2);
    }

    /**
     * when PLayer2 Strikes the black .
     */
    public void BlackPlayer2 (View v){
        Score2 += 1;
        displayForPlayer2(Score2);
    }

    /**
     * when PLayer2 Strikes the Striker .
     */
    public void MinusPlayer2 (View v){
        if(Score2 > 1) {
            Score2 -= 2;
            displayForPlayer2(Score2);
        }else{
            Score2 = 0;
            displayForPlayer2(Score2);
        }
    }

    /**
     * when PLayer2 Strikes the Striker .
     */
    public void Reset (){
        Score1 = 0;
        Score2 = 0 ;
        displayForPlayer1(Score1);
        displayForPlayer2(Score2);
    }
    public void Reset (View v){
        Score1 = 0;
        Score2 = 0 ;
        displayForPlayer1(Score1);
        displayForPlayer2(Score2);
    }


    /**
     * Displays the given score for PLayer1.
     */
    public void displayForPlayer1 (int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
        if ( Score1 >= 20 ) {
            TextView Result = (TextView) findViewById(R.id.result);
            Result.setText("Player1 wins the Match");
            Reset();
        }
    }

    /**
     * Displays the given score for Player2.
     */
    public void displayForPlayer2 (int score) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
        if ( Score2 >= 20 ) {
            TextView Result = (TextView) findViewById(R.id.result);
            Result.setText("Player2 wins the Match");
            Reset();
        }
    }

}
