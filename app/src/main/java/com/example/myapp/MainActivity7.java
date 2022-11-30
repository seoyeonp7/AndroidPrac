package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity7 extends AppCompatActivity {

    EditText etMine,etCom,etResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        etMine = findViewById(R.id.etMine);
        etCom = findViewById(R.id.etCom);
        etResult = findViewById(R.id.etResult);

        myClick();
    }

    private void myClick() {
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] arr = {"가위","바위","보"};
                Random random = new Random();

                String mine = etMine.getText().toString();
                String com = arr[random.nextInt(3)];
                String result="";

                if(mine.equals(com)){
                    result = "비김!";
                } else if(mine.equals("가위")&&com.equals("보")
                ||mine.equals("바위")&&com.equals("가위")
                ||mine.equals("보")&&com.equals("바위")) {
                    result = "이김!";
                } else {
                    result ="짐!";
                }

                etCom.setText(com);
                etResult.setText(result);
            }
        });
    }
}