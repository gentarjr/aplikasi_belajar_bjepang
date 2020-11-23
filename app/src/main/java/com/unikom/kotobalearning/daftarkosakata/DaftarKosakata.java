package com.unikom.kotobalearning.daftarkosakata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.MainActivity;
import com.unikom.kotobalearning.R;

public class DaftarKosakata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar);
    }

    public void kataBenda(View view) {
        Intent intent = new Intent(DaftarKosakata.this, KataBenda.class);
        startActivity(intent);
    }

    public void kataKerja(View view) {
        Intent intent = new Intent(DaftarKosakata.this, KataKerja.class);
        startActivity(intent);
    }

    public void kataSifat(View view) {
        Intent intent = new Intent(DaftarKosakata.this, KataSifat.class);
        startActivity(intent);
    }

}
