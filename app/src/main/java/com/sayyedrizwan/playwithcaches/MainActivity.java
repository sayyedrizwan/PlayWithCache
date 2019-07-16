package com.sayyedrizwan.playwithcaches;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.sayyedrizwan.playwithcache.PlayCache;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;
    Button cleancache, cleancachewithmessage, cleanappdata, cleanappdatawithmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cleancache = findViewById(R.id.cleancache);
        cleancachewithmessage = findViewById(R.id.cleancachewithmessage);
        cleanappdata = findViewById(R.id.cleanappdata);
        cleanappdatawithmessage = findViewById(R.id.cleanappdatawithmessage);

        cleancache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PlayCache.cleanCache(context);

            }
        });

        cleancachewithmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayCache.cleanCachewithMessage(context, "Cleared cache"); //remain message empty if want to get defualt message
            }
        });


        cleanappdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayCache.clearAppData(context);
            }
        });

        cleanappdatawithmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayCache.clearAppDatawithToast(context, "Data delete successfully");
            }
        });



    }
}
