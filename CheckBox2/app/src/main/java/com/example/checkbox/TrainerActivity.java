package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class TrainerActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3;
    Button sub,hm;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);

        cb1 = findViewById(R.id.checkBoxCP);
        cb2 = findViewById(R.id.checkSS);
        cb3 = findViewById(R.id.checkAV);
        sub = findViewById(R.id.buttonSubmit);
        hm=findViewById(R.id.buttonHome);
    }
}
