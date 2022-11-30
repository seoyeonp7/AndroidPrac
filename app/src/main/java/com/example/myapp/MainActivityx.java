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

    TextView tv_disp;
    EditText et_dan;
    int answer1,answer2,answer3;
    String answer;
    StringBuffer str;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainx);
        et_dan = findViewById(R.id.et_dan);
        tv_disp = findViewById(R.id.tv_disp);
        Random random = new Random();
        answer1 = random.nextInt(9)+1;
        answer2 = random.nextInt(9)+1;
        answer3 = random.nextInt(9)+1;
        answer = ""+answer1+answer2+answer3;
        Log.d("ddit",answer);
        str = new StringBuffer();
        myClick();
    }

    private void myClick() {

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int strikeCount=0;
                int ballCount=0;
                String guess = et_dan.getText().toString();
                String a = guess.substring(0,1);
                String b = guess.substring(1,2);
                String c = guess.substring(2,3);
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                int cc = Integer.parseInt(c);
                Log.d("ddit aa",aa+"");

                String guessT=a+b+c;

                if(answer1==aa) strikeCount++;
                if(answer2==bb) strikeCount++;
                if(answer3==cc) strikeCount++;
                Log.d("ddit scrikeCount ",strikeCount+"");
                if(answer1==bb) ballCount++;
                if(answer1==cc) ballCount++;
                if(answer2==aa) ballCount++;
                if(answer2==cc) ballCount++;
                if(answer3==aa) ballCount++;
                if(answer3==bb) ballCount++;
                Log.d("ddit ballCount ",ballCount+"");

                if(guessT.equals(answer)){
                    result = "정답";
                    Toast.makeText(getApplicationContext(), "정답!", Toast.LENGTH_LONG).show();

                } else {
                    result = strikeCount +"S "+ballCount+"B";
                }
                str.append(guessT + "\t\t\t\t\t\t\t" + result + "\n");
                tv_disp.setText(str);
                et_dan.setText("");
            }
        });
    }
}