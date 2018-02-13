package com.example.anderson.c2_p23;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView light1;
    private Handler handler1;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.change_light);
        light1 = (TextView) findViewById(R.id.light);
        handler1 = new Handler();



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        switch(count) {
                            case 0:
                            light1.setBackgroundColor(Color.parseColor("#008000"));
                            break;
                            case 1:
                            light1.setBackgroundColor(Color.parseColor("#FFA500"));
                            break;
                            case 2:
                            light1.setBackgroundColor(Color.parseColor("#FF0000"));
                            count = -1;
                            break;
                        }
                        count ++;
                    }
                },2000);

            }
        });

    }
}
