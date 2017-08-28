package com.seung.voice;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Scroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res  = getResources();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) res.getDrawable(R.drawable.s);
        int bitMapWidth = bitmapDrawable.getIntrinsicWidth();
        int bitMapHeight = bitmapDrawable.getIntrinsicHeight();
        imageView.setImageDrawable(bitmapDrawable);
        imageView.getLayoutParams().width=bitMapWidth+100;
        imageView.getLayoutParams().height=bitMapHeight+100;
        Button b = (Button)findViewById(R.id.change);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Resources res2 = getResources();
                BitmapDrawable bitmapDrawable1 = (BitmapDrawable) res2.getDrawable(R.drawable.image2);
                int bitMapWidth1= bitmapDrawable1.getIntrinsicWidth();
                int bitMapHeight1 = bitmapDrawable1.getIntrinsicHeight();
                imageView.setImageDrawable(bitmapDrawable1);
                imageView.getLayoutParams().width=bitMapWidth1;
                imageView.getLayoutParams().height=bitMapHeight1;

            }
        });
    }
}
