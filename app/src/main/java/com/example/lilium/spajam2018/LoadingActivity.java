package com.example.lilium.spajam2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Intent intent = getIntent();
        String message = intent.getStringExtra("train");
        TextView t=(TextView)findViewById(R.id.loading_message);
        t.setText(message+"。ベルトをセットして下さい");

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent =new Intent(LoadingActivity.this,CameraSettingActivity.class);
        startActivity(intent);
        return super.onTouchEvent(event);
    }
}
