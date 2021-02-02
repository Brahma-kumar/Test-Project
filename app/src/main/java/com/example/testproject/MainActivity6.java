package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener{

    Button btn_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btn_6 = findViewById(R.id.btn6);
        btn_6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_down,  R.anim.slide_up);
        finish();
    }
}