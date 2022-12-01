package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivityx extends AppCompatActivity {

    String com;
    EditText et;
    TextView tv_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainx);

        et = findViewById(R.id.et);
        tv_disp = findViewById(R.id.tv_disp);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myclick();
            }
        });
        setComRandom();
    }

    public void setComRandom() {
        int[] arr9 = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<1000; i++){
            int rnd = (int) (Math.random()*9);
            int a = arr9[0];
            int b = arr9[rnd];
            arr9[0]=b;
            arr9[rnd]=a;
        }
        com = arr9[0]+""+arr9[1]+arr9[2];
        Log.d("ddit",com);
    }

    public void myclick(){
        String mine = et.getText().toString();
        int s = getStrike(mine,com);
        int b = getBall(mine,com);
        Log.d("ddit", s+","+b);

        String str_old = tv_disp.getText().toString();
        String str_new = mine+"  "+s+"S"+b+"B\n";

        tv_disp.setText(str_old+str_new);
        et.setText("");

        if (s == 3) {
            Toast.makeText(getApplicationContext(), mine+"을 맞췄습니다.", Toast.LENGTH_LONG).show();
        }
    }

    public int getBall(String mine, String com){
        int ret = 0;
        String m1 = mine.substring(0,1);
        String m2 = mine.substring(1,2);
        String m3 = mine.substring(2,3);

        String c1 = com.substring(0,1);
        String c2 = com.substring(1,2);
        String c3 = com.substring(2,3);

        if(c1.equals(m2)||c1.equals(m3)) ret++;
        if(c2.equals(m1)||c1.equals(m3)) ret++;
        if(c3.equals(m1)||c1.equals(m2)) ret++;

        return ret;
    }

    public int getStrike(String mine, String com){
        int ret = 0;
        String m1 = mine.substring(0,1);
        String m2 = mine.substring(1,2);
        String m3 = mine.substring(2,3);

        String c1 = com.substring(0,1);
        String c2 = com.substring(1,2);
        String c3 = com.substring(2,3);

        if(c1.equals(m1)) ret++;
        if(c2.equals(m2)) ret++;
        if(c3.equals(m3)) ret++;

        return ret;
    }
}