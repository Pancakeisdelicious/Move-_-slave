package com.example.move;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

//        회원 가입 버튼, 로그인 버튼
        Button btnSign = (Button) findViewById(R.id.signin);
        Button btnLogin = (Button) findViewById(R.id.login);
//        로그인 버튼을 누르면 로그인 화면으로 이동

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_Login.class);
                startActivity(intent);
            }
        });


//        회원가입 버튼을 누루면 회원가입 첫번째 화면으로 이동

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_Signup1.class);
                startActivity(intent);

            }
        });



    }
}