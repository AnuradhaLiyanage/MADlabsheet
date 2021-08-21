package com.example.madlab_selfstudies;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.Intent;
import android.view.View;
import  android.widget.Button;
import android.provider.Settings;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    //protected void onCreate(Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    //}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer player = MediaPlayer.create(this,Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
    }
}