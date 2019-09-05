package com.example.divideby35;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1;
    TextView tv,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.take);
        tv=findViewById(R.id.txt1);
        b1=findViewById(R.id.by3);
        tv2=findViewById(R.id.txt2);
        tv3=findViewById(R.id.txt3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=String.valueOf(e1.getText());
                int no=Integer.parseInt(s1);
                String three="";
                String five="";
                String both="";

                for (int i=0;i<no;i++)
                {
                    if(no%3==0)
                    {
                        three= three+" "+i;
                    }
                    if(no%5==0)
                    {
                        five=five+ " "+i;
                    }
                    if(no%3==0 && no%5==0)
                    {
                        both=both+ " "+i;
                    }
                }
                tv.setText(three);
                tv2.setText(five);
                tv3.setText(both);


            }
        });
    }
}
