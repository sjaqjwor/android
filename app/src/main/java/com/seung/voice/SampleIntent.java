package com.seung.voice;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_intent);

        Button button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
               //새로띄운 액티에서 이전 액티로 인테트를 전달하고 싶을때
                intent.putExtra("name","mike");
                //응답보내기
                setResult(RESULT_OK,intent);
                //현재 액티비티 없애기
                finish();
            }
        });
    }
}
