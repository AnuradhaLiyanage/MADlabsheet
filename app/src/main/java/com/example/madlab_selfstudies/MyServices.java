package com.example.madlab_selfstudies;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;


import android.os.Bundle;

    public class MyServices extends Service {
        private MediaPlayer player;

        @Override

        public int onStartCommand(Intent intent, int flags, int startId) {
            player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
            player.setLooping(true);
            player.start();
            return START_STICKY;
            //return super.onStartCommand(intent, flags, startId);
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            player.stop();
        }

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }

}