package com.example.lilium.spajam2018;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);
        final TextView t =(TextView)findViewById(R.id.train_timer_text);
        new CountDownTimer(6000, 1000) {

            public void onTick(long millisUntilFinished) {
                t.setText("seconds remaining: " + (millisUntilFinished / 1000-1));
            }

            public void onFinish() {
               t.setText("ここに映像が出る");

                new CountDownTimer(6000, 1000) {
                    TextView trainCount=(TextView)findViewById(R.id.train_count);
                    public void onTick(long millisUntilFinished) {
                        trainCount.setText( Long.toString(6- millisUntilFinished / 1000)+"回");
                    }

                    public void onFinish() {
                        trainCount.setText("お疲れ様でした");

                        new CountDownTimer(3000, 1000) {

                            public void onTick(long millisUntilFinished) {

                             }

                            public void onFinish() {
                                Intent intent =new Intent(TrainActivity.this,ResultActivity.class);
                                startActivity(intent);

                            }
                        }.start();




                    }
                }.start();


            }
        }.start();
    }
}
