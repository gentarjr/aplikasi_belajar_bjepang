package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.R;

import java.io.IOException;

public class KataSifat extends AppCompatActivity implements View.OnClickListener{
    private Button btnPlay, btnPlay1;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_sifat);

        mp = new MediaPlayer();

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay1 = (Button) findViewById(R.id.btnPlay1);

        btnPlay.setOnClickListener(this);
        btnPlay1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.contoh1);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.contoh3);
                play();
                btnPlay1.setEnabled(false);
                break;
        }
    }

    public void stateAwal(){
        btnPlay.setEnabled(true);
        btnPlay1.setEnabled(true);
    }

    /** Dijalankan Oleh Tombol Play */
    private void play() {
        /** Memanggil File MP3 "indonesiaraya.mp3" */
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Menjalankan Audio */
        mp.start();

        /** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
}
