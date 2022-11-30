package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    TextView tv, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        myClick();


    }

    private void myClick() {

        Button btn = findViewById(R.id.btn);

        List<Integer> a = new ArrayList();
        int lotto[] = new int[6];
        Random random = new Random();

        for (int i = 1; i < 46; i++) {
            a.add(i);
        }
        for(int i = 0; i<2000;i++){
            int rnd = random.nextInt(45);
            int temp = a.get(0);
            a.set(0,a.get(rnd));
            a.set(rnd,temp);
        }
        for(int i=0;i<6;i++){
            lotto[i] = a.get(i);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ddit",lotto[0] +"");

                tv.setText(lotto[0]+"");
                tv2.setText(lotto[1]+"");
                tv3.setText(lotto[2]+"");
                tv4.setText(lotto[3]+"");
                tv5.setText(lotto[4]+"");
                tv6.setText(lotto[5]+"");
            }
        });
    }
}