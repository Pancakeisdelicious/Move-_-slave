package com.example.move;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Activity_Signup1 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

//        회원가입 두번째 화면으로 가는 다음 버튼(이름, 나이, 성별 입력)
        Button btnNext = (Button) findViewById(R.id.next);

//        다음을 누르면 회원가입 두번째 페이지로 간다.
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Activity_Signup2.class);
                startActivity(intent);
            }
        });

    }
}
