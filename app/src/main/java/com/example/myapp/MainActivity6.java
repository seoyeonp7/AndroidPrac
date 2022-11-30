package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity6 extends AppCompatActivity {

    EditText et_dan;
    TextView tv_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        et_dan = findViewById(R.id.et_dan);
        tv_disp = findViewById(R.id.tv_disp);

        myClick();
    }

    private void myClick() {

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dan = Integer.parseInt(et_dan.getText().toString());
                String msg="";

//                msg +=  dan+"*"+2+"="+dan*2+"\n";
//                msg +=  dan+"*"+3+"="+dan*2+"\n";
//                msg +=  dan+"*"+4+"="+dan*2+"\n";
//                msg +=  dan+"*"+5+"="+dan*2+"\n";
//                msg +=  dan+"*"+6+"="+dan*2+"\n";
//                msg +=  dan+"*"+7+"="+dan*2+"\n";
//                msg +=  dan+"*"+8+"="+dan*2+"\n";
//                msg +=  dan+"*"+9+"="+dan*2+"\n";

                for(int i=2; i<10; i++){
                    msg +=  dan+"*"+i+"="+dan*i+"\n";
                }
                    tv_disp.setText(msg);
            }
        });
    }
}