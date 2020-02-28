package com.efarrar.cof_androidviewanimation_customlibrary;

/*
Title: Easily Create Animations with the AndroidViewAnimation Library - Android Studio Tutorial
Content Creator: Code in Flow
URL: https://www.youtube.com/watch?v=otMSB-dFuY8&list=PLrnPJCHvNZuARS1W7qMt-zxBNqWYZpOg6
    https://codinginflow.com/tutorials/android/androidviewanimations
1. Set up elements.
2. Go into Build Gradle (Module:app) and add the 2 dependincies

 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;         //var for textView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.tvTextView);          //instantiate textView

        /*
        creating var for btn, instantiating btnAnimate, setting the animation, applying
        the animation to the text view.
         */
        Button btnAnimate = findViewById(R.id.btnAnimate);
        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(700)
                        .repeat(2)
                        .playOn(mTextView);
            }
        });
    }
}
