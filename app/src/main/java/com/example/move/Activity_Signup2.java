package com.example.move;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Activity_Signup2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

//        회원가입 완료 버튼
        Button btnComplete = (Button)findViewById(R.id.signin);
//        완료 버튼을 누르면 완료 화면으로 넘어간다.
        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Activity_SignupDone.class);
                startActivity(intent);

            }

        });
    }
}
