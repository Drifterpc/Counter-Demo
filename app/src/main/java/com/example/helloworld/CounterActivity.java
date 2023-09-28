package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    TextView tvResult;//定义文字显示
    Button Add, Sub, Clear;//定义按钮显示
    int Counter;//定义初始数字
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tvResult = (TextView)findViewById(R.id.textView2);//设置文字显示
        Add = (Button)findViewById(R.id.button1);//设置按钮显示
        Sub = (Button)findViewById(R.id.button2);//设置按钮显示
        Clear = (Button)findViewById(R.id.button3);//设置按钮显示

        Counter = 0;//设置初始数字
        //代码功能设置setOnClickListener对象
        //Add为+1
        Add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Counter++;
                tvResult.setText("The total is " + Counter);
            }
        });
        //Sub为-1
        Sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Counter--;
                tvResult.setText("The total is " + Counter);
            }
        });
        //Clear为清零
        Clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Counter = 0;
                tvResult.setText("The total is " + Counter);
            }

        });
    }
}