package com.example.lilium.spajam2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CameraSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_setting);
        Button cameraIsReadyButton=(Button)findViewById (R.id.camera_ready_button);
        cameraIsReadyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CameraSettingActivity.this,TrainActivity.class);
                startActivity(intent);

            }
        });
    }
}
