package com.marwadi.radio_button_group;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);

        img = findViewById(R.id.img);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rb1.isChecked()){
                    img.setImageResource(R.drawable.india);
                }
                else if(rb2.isChecked()){
                    img.setImageResource(R.drawable.australia);
                }
                else if(rb3.isChecked()){
                    img.setImageResource(R.drawable.fiji);
                }
                else if(rb4.isChecked()){
                    img.setImageResource(R.drawable.afghanistan);
                }
                else if(rb5.isChecked()){
                    img.setImageResource(R.drawable.canada);
                }

            }
        });





    }
}