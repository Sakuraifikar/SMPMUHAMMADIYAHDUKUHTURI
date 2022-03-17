package com.example.smpmuhammadiyahdukuhturi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.sklh1,
            R.drawable.sklh2,
            R.drawable.sklh3,
            R.drawable.sklh1,
            R.drawable.sklh2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void prestasi(View view) {
        Intent intent = new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }

    public void FB(View view) {
        goToUrl("https://www.facebook.com/smp.karanganyar");
    }

    public void YT(View view) {
        goToUrl("https://www.youtube.com/channel/UCQUIQ8c2GeoStv1DT1Uf1mA/featured");
    }

    public void GGL(View view) {
        goToUrl("https://hayusakola.com/view/smp-muhammadiyah-dukuhturi");
    }

    public void IG(View view) {
        goToUrl("https://www.instagram.com/smp_muhari/");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}