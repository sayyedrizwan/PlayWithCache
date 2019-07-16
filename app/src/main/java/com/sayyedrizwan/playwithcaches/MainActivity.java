package com.sayyedrizwan.playwithcaches;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.sayyedrizwan.playwithcache.PlayCache;
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
                PlayCache.cleanCachewithMessage(context, "Cleared cache"); //if message left empty it will give defualt message
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
                PlayCache.clearAppDatawithToast(context, "Data delete successfully"); //if message left empty it will give defualt message
            }
        });



    }
}
