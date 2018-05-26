package com.example.lilium.spajam2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent =new Intent(TitleActivity.this,MenuActivity.class);
        startActivity(intent);
        return super.onTouchEvent(event);
    }
}
