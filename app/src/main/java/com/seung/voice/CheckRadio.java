package com.seung.voice;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CheckRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_radio);
        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        final TextView textView = (TextView)findViewById(R.id.tid);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(group.getCheckedRadioButtonId()==R.id.rbutton){
                    textView.setText("남성");
                }
                if(group.getCheckedRadioButtonId()==R.id.rbutton1){
                    textView.setText("여성");
                }
            }
        });
        Button select =(Button)findViewById(R.id.select);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup.clearCheck();
            }
        });
    }
}
