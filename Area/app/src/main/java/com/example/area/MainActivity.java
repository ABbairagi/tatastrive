package com.example.area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);
        tv=findViewById(R.id.area);
        tv2=findViewById(R.id.perimeter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r=String.valueOf(editText.getText());
                double a=3.14*Float.parseFloat(r)*Float.parseFloat(r);
                tv.setText(String.valueOf(a));

                double p= 2*3.14*Float.parseFloat(r)*Float.parseFloat(r);
                tv2.setText(String.valueOf(p));
            }
        });

    }
}
