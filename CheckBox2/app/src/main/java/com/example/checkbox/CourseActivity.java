package com.example.checkbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CourseActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3;
    Button sub, hm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        cb1 = findViewById(R.id.checkBoxAAD);
        cb2 = findViewById(R.id.checkBoxASC);
        cb3 = findViewById(R.id.checkBoxRSA);
        sub = findViewById(R.id.buttonSubmit);
        hm = findViewById(R.id.buttonHome);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Courses";
                if (cb1.isChecked()) {
                    result += "\nAndroid App Development";
                }
                if (cb2.isChecked()) {
                    result += "\nAuto Sales Consultant";
                }
                if (cb3.isChecked()) {
                    result += "\nRetail Sales Associate";
                }
                Toast t = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT);
                t.show();
            }
        });

        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CourseActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.checkBoxAAD:
                str = checked ? "Android App Development Selected" : "Android App Development Deselected";
                break;
            case R.id.checkBoxASC:
                str = checked ? "Auto Sales Consultant" : "Auto Sales Consultant Deselected";
                break;
            case R.id.checkBoxRSA:
                str = checked ? "Retail Sales Associate Selected" : "Retail Sales Associate Deselected";
                break;
        }
        Toast t = Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT);
        
        t.show();
    }
}
