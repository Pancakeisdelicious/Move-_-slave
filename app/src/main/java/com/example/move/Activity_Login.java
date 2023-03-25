package com.example.move;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Activity_Login extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        로그인 버튼
        Button btnLogin  = (Button) findViewById(R.id.buttonlogin);

//        로그인 버튼을 누르면 메인화면으로 넘어가진다.


    }
}
