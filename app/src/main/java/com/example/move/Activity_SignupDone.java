package com.example.move;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Activity_SignupDone extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupdone);
//        시작하기 버튼
        Button btnStart = (Button)findViewById(R.id.buttonstart);

    }
}
