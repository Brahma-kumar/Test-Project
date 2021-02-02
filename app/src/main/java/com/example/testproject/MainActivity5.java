package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener{

    Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn_5 = findViewById(R.id.btn5);
        btn_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_down,  R.anim.slide_up);
        finish();
    }
}