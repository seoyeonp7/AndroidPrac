package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity9 extends AppCompatActivity {

    TextView tv_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        tv_disp = findViewById(R.id.tv_disp);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btnCall = findViewById(R.id.btnCall);

        btn1.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn2.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn3.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn4.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn5.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn6.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn7.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn8.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn9.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btn0.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myclick(view); }});
        btnCall.setOnClickListener(new View.OnClickListener() { public void onClick(View view) { myCall(view); }});

    }

    public void myclick(View view) {
        Button obj = (Button) view;
        Log.d("ddit", obj.getText().toString());
        String str_old = tv_disp.getText().toString();
        String str_new = obj.getText().toString();
        tv_disp.setText(str_old+str_new);
    }

    public void myCall(View view) {
        String str_tel = tv_disp.getText().toString();
        Toast.makeText(getApplicationContext(), "calling\n"+str_tel, Toast.LENGTH_SHORT).show();
    }
}