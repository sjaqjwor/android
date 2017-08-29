package com.seung.voice;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(REQUEST_CODE_MENU==requestCode){
            Toast.makeText(this,"호출"+requestCode+"결과코드"+resultCode,Toast.LENGTH_LONG).show();
        }
        if(resultCode==RESULT_OK){
            String name= data.getExtras().getString("name");
            Toast.makeText(this,"name"+name,Toast.LENGTH_LONG).show();
        }
    }

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
        Button button8 = new Button(this);
        button8.setText("examLayoutInflater");
        button8.setLayoutParams(params);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(),examLayoutInflater.class);
                Toast.makeText(MainActivity.this,"눌렀다",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        Button button9 = new Button(this);
        button9.setText("메뉴화면 띄우기");
        button9.setLayoutParams(params);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent();
                ComponentName name = new ComponentName("com.seung.voice","com.seung.voice.SampleIntent");
                intent.setComponent(name);
                startActivityForResult(intent,REQUEST_CODE_MENU);

            }
        });
        Button button10 = new Button(this);
        button10.setText("이미지 찾아줘");
        button10.setLayoutParams(params);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this,ImageFindActivity.class);
                startActivity(intent);
            }
        });
        //linearLayout.addView(button1);
        //linearLayout.addView(button2);
        //linearLayout.addView(button3);
        //linearLayout.addView(button4);
        //linearLayout.addView(button5);
        //linearLayout.addView(button6);
        //linearLayout.addView(button7);
        linearLayout.addView(button8);
        linearLayout.addView(button9);
        linearLayout.addView(button10);
        setContentView(linearLayout);

    }



}
