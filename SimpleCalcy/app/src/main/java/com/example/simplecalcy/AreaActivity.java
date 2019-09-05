package com.example.simplecalcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AreaActivity extends AppCompatActivity {

    EditText edt1;
    Button b1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        edt1=findViewById(R.id.txt1);
        b1=findViewById(R.id.btn1);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=String.valueOf(edt1.getText());
                double r=Float.parseFloat(s1);
            }
        });

    }
}
