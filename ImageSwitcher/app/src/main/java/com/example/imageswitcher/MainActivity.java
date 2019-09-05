package com.example.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher is;
    Button btn,btn1;
    int imageIds[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5};
    int cnt = imageIds.length;
    int currentIndex = -1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonNext);
        btn1=findViewById(R.id.buttonPrev);
        is = findViewById(R.id.simpleImageSwithcher);

        //set the view factor of the ImageSwitcher that will create ImageView object when asked
        is.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView iv=new ImageView(getApplicationContext());
                iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                iv.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
                return iv;
            }
        });

        //Declare in and out animations and load them using AnimationUtils class
        Animation in= AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        //Set the animation type to ImageSwitcher
        is.setAnimation(in);
        is.setAnimation(out);

        //clickListener For NEXT button
        //when clicked on Button ImageSwitcher will switch between Images
        //The current Image will go OUT and next Image will come in with specified animation

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if (currentIndex == 0)
                    currentIndex = 0;

                is.setImageResource(imageIds[currentIndex]);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex--;

                is.setImageResource(imageIds[currentIndex]);
            }
        });

    }
}
