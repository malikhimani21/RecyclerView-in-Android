package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewDataActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView1, textView2;

    private static final String KEY1 = "com.example.myapplication.KEY1";
    private static final String KEY2 = "com.example.myapplication.KEY2";
    private static final String KEY3 = "com.example.myapplication.KEY3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        imageView = (ImageView) findViewById(R.id.img_receive);
        textView1 = (TextView) findViewById(R.id.txt1_receive);
        textView2 = (TextView) findViewById(R.id.txt2_receive);

        imageView.setImageResource(getIntent().getIntExtra(KEY1, R.drawable.ic_launcher_background));
        textView1.setText(getIntent().getStringExtra(KEY2));
        textView2.setText(getIntent().getStringExtra(KEY3));
    }
}
