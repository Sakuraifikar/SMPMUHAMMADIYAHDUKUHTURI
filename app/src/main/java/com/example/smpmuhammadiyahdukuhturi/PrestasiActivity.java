package com.example.smpmuhammadiyahdukuhturi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrestasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestasi);
    }

    public void buku7(View view) {
        Intent intent = new Intent(PrestasiActivity.this, Buku7Activity.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(PrestasiActivity.this, Buku8Activity.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(PrestasiActivity.this, Buku9Activity.class);
        startActivity(intent);
    }
}