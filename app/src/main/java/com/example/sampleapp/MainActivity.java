package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    //splash screen
    private static int SPLASH_TIME_OUT =4000;



// activity life cycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HOMEintent= new Intent(MainActivity.this,location.class);
                startActivity(HOMEintent);
                finish();
            }
        },SPLASH_TIME_OUT);




        //-------------------------------------------//
        Log.d("tag","on create");
        // new activity page on click of button

        Button button =(Button)findViewById(R.id.b1);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent =new Intent(MainActivity.this,OtherAcitvity.class);
                 startActivity(intent);
             }
         });
         //dailer activity
        Button button1 =(Button)findViewById(R.id.b4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent (Intent.ACTION_DIAL, Uri.parse(getString(R.string.contact_us)));
                startActivity(intent1);
            }
        });
         // google search activity
        Button button2 =(Button)findViewById(R.id.b3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (Intent.ACTION_VIEW, Uri.parse(getString(R.string.location)));
                startActivity(intent2);
            }
        });
        Button button3 =(Button)findViewById(R.id.b2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent3);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","on destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","on stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","on start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","on Pasue");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag","on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","on Resume");
    }




}
