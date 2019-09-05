package com.example.cb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=findViewById(R.id.checkBox);

//        c.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onclick(v);
//            }
//        });

        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                onclick();
            }
        });

    }

    public void onclick() {
        //boolean check = ((CheckBox) view).isChecked();
        if (c.isChecked()) {
            Toast.makeText(this, "Checked", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Unchecked", Toast.LENGTH_SHORT).show();
        }
    }
}
