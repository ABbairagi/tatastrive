package com.example.simplecalcy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AvgActivity extends AppCompatActivity {
    EditText edt1,edt2,edt3;
    Button b1,b2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.et1);
        edt2=findViewById(R.id.et2);
        edt3= findViewById(R.id.et3);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        txt=findViewById(R.id.tv1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=String.valueOf(edt1.getText());
                String s2=String.valueOf(edt2.getText());
                String s3=String.valueOf(edt3.getText());

                int no=(Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3))/3;
                txt.setText(String.valueOf(no));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AvgActivity.this,AreaActivity.class);
                startActivity(intent);
            }
        });
    }
}
