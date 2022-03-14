package com.example.smpmuhammadiyahdukuhturi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void satu(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumdrumbandActivity.class);
        startActivity(intent);
    }

    public void dua(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumfutsalActivity.class);
        startActivity(intent);
    }

    public void tiga(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumkegiatanActivity.class);
        startActivity(intent);
    }
}