package com.seung.voice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams  params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        Button button1 = new Button(this);
        button1.setText("Naver");
        button1.setLayoutParams(params);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(myIntent);
            }
        });
        Button button2 = new Button(this);
        button2.setText("Main2");
        button2.setLayoutParams(params);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(myIntent);
            }
        });
        Button button3 = new Button(this);
        button3.setText("Main3");
        button3.setLayoutParams(params);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(myIntent);
            }
        });
        Button button4 = new Button(this);
        button4.setText("Scroll");
        button4.setLayoutParams(params);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),Scroll.class);
                Toast.makeText(MainActivity.this,"눌렀다",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        Button button5 = new Button(this);
        button5.setText("checkbox");
        button5.setLayoutParams(params);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),CheckRadio.class);
                Toast.makeText(MainActivity.this,"눌렀다",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        Button button6 = new Button(this);
        button6.setText("challege03");
        button6.setLayoutParams(params);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),challege03.class);
                Toast.makeText(MainActivity.this,"눌렀다",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        Button button7 = new Button(this);
        button7.setText("challege03");
        button7.setLayoutParams(params);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),challenge04.class);
                Toast.makeText(MainActivity.this,"눌렀다",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        linearLayout.addView(button1);
        linearLayout.addView(button2);
        linearLayout.addView(button3);
        linearLayout.addView(button4);
        linearLayout.addView(button5);
        linearLayout.addView(button6);
        linearLayout.addView(button7);
        setContentView(linearLayout);

    }



}
