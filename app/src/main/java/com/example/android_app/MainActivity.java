package com.example.android_app;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText editTextNo1,editTextNo2;
    Button buttonAdd,buttonSub,buttonMul,buttonDiv;
    TextView textViewres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNo1=findViewById(R.id.editText);
        editTextNo2=findViewById(R.id.editText2);
        buttonAdd=findViewById(R.id.add);
        buttonSub=findViewById(R.id.sub);
        buttonMul=findViewById(R.id.mul);
        buttonDiv=findViewById(R.id.div);
        textViewres=findViewById(R.id.res);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Lets have Toast", Toast.LENGTH_SHORT).show();
                String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf(editTextNo2.getText());
                int sum= Integer.parseInt(s1)+Integer.parseInt(s2);
//                Toast.makeText(MainActivity.this, "sum="+sum, Toast.LENGTH_SHORT).show();
                textViewres.setText(String.valueOf(sum));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf(editTextNo2.getText());
                int sub= Integer.parseInt(s1)-Integer.parseInt(s2);
                textViewres.setText(String.valueOf(sub));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf(editTextNo2.getText());
                int mul= Integer.parseInt(s1)*Integer.parseInt(s2);
                textViewres.setText(String.valueOf(mul));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= String.valueOf(editTextNo1.getText());
                String s2= String.valueOf(editTextNo2.getText());
                float div= Integer.parseInt(s1)/Integer.parseInt(s2);
                textViewres.setText(String.valueOf(div));
            }
        });
    }
}
