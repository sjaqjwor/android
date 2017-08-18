package com.seung.voice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onButtonBack(View v){
        Toast.makeText(getApplicationContext(),"돌아가기버튼 눌렀어요",Toast.LENGTH_LONG).show();
        finish();
    }
}
