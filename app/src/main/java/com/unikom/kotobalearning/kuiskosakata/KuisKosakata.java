package com.unikom.kotobalearning.kuiskosakata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.R;

public class KuisKosakata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_kuis);
    }

    public void kuisKataBenda(View view) {
        Intent intent = new Intent(KuisKosakata.this, KuisKataBenda.class);
        startActivity(intent);
    }

    public void kuisKataKerja(View view) {
        Intent intent = new Intent(KuisKosakata.this, KuisKataKerja.class);
        startActivity(intent);
    }

    public void kuisKataSifat(View view) {
        Intent intent = new Intent(KuisKosakata.this, KuisKataSifat.class);
        startActivity(intent);
    }
}
