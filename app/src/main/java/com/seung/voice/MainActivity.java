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
        linearLayout.addView(button1);
        linearLayout.addView(button2);
        linearLayout.addView(button3);
        setContentView(linearLayout);

    }



}
