package com.unikom.kotobalearning.highscore;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.R;
import com.unikom.kotobalearning.kuiskosakata.KuisKosakata;

public class HighScoreKataSifat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_highscore_sifat);

        TextView txtScore = (TextView) findViewById(R.id.textScoreSifat);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScoreSifat);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Your score: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighScoreKataSifat.this, KuisKosakata.class);
        startActivity(intent);
    }
}
