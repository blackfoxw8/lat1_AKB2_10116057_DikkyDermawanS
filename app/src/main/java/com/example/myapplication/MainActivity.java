package com.example.myapplication;

/**
 * 10116057 Dikky Dermawan S AKB-2 / IF-2
 *
 * CHANGELOG V0.1 03/04/2019 14.00
 * Membuat Splash Screen
 *
 * CHANGELOG V0.2 05/04/2019 19.00
 * Membuat Halaman Kedua
 * Membuat Halaman Ketiga
 * Membuat Halaman Terakhir
 * */


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @ Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });

    }
    public void openMain2Activity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
