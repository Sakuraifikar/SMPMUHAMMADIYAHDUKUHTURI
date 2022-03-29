package com.example.smpmuhammadiyahdukuhturi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkskulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

    }

    public void osis(View view) {
        Intent intent = new Intent(EkskulActivity.this, OsisActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(EkskulActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(EkskulActivity.this, FutsalActivity.class);
        startActivity(intent);
    }
}