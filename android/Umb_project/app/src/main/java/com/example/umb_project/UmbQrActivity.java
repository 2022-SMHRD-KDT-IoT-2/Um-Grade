package com.example.umb_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.zxing.integration.android.IntentIntegrator;

public class UmbQrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb_qr);

        new IntentIntegrator(this).initiateScan();
    }
}