package com.unikom.kotobalearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.unikom.kotobalearning.daftarkosakata.DaftarKosakata;
import com.unikom.kotobalearning.kuiskosakata.KuisKosakata;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void daftarKosakata(View view) {
        Intent intent = new Intent(MainActivity.this, DaftarKosakata.class);
        startActivity(intent);
    }

    public void kuisKosakata(View view) {
        Intent intent = new Intent(MainActivity.this, KuisKosakata.class);
        startActivity(intent);
    }
}