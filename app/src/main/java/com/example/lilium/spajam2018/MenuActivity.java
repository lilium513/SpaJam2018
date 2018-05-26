package com.example.lilium.spajam2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button udetate_button=(Button)findViewById(R.id.udetate);
        Button sukuwatto_button=(Button)findViewById(R.id.sukuwatto);
        Button hukkin_button=(Button)findViewById(R.id.hukkin);
        View.OnClickListener on =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), LoadingActivity.class);
                intent.putExtra("train", ((Button)view).getText());
                startActivity(intent);
            }
        };
        udetate_button.setOnClickListener(on);
        sukuwatto_button.setOnClickListener(on);
        hukkin_button.setOnClickListener(on);
    }
}
