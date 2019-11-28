package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //載入版

        tv=(TextView)findViewById(R.id.textView1);    // 取名稱宣告/找元件ＩＤ


        }
        public void btn1(View v){

            tv.setBackgroundColor(Color.RED);
        }
        public void btn2(View v){

            tv.setBackgroundColor(Color.GREEN);
        }
        public void btn3(View v){

            tv.setBackgroundColor(Color.BLUE);
        }
        public void btn4(View v) {
            finish();
        }
    }
