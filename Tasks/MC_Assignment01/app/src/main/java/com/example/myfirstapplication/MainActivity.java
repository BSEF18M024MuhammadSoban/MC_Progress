package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    public void startApp(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(10000);
        Intent intent=new Intent(MainActivity.this,PlayAlphabets.class);
        startActivity(intent);
    }

}