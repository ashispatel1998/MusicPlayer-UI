package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ImageView zoom_in;
    RelativeLayout image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoom_in=findViewById(R.id.zoom_in);

        image=findViewById(R.id.back_image_1);

        zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                zoom_in.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(getApplicationContext(),DetailActivity.class);
                        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                                .makeSceneTransitionAnimation(MainActivity.this,image, ViewCompat.getTransitionName(image));
                        startActivity(intent, optionsCompat.toBundle());
                    }
                });

            }
        });
    }
}