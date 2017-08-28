package com.seung.voice;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class challege03 extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challege03);
        Button button1 = (Button)findViewById(R.id.b1);
        Button button2 = (Button)findViewById(R.id.b2);
        imageView = (ImageView)findViewById(R.id.imageView2);
        imageView1 = (ImageView)findViewById(R.id.imageView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                down();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            up();
            }
        });
    }
    private  void down(){
        imageView1.setImageResource(0);
        imageView.setImageResource(R.drawable.kakao);
        imageView1.invalidate();
        imageView.invalidate();
    }
    private void up(){
        imageView.setImageResource(0);
        imageView1.setImageResource(R.drawable.kakao);
        //view invalidate() 뷰갱신
        imageView1.invalidate();
        imageView.invalidate();
    }
}
