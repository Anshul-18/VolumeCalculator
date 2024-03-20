package com.example.musicplayer;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyCustomService extends Service {

    //to play music we need a media player object.
    private MediaPlayer player;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //this will play the audio of default ringtone on device.
        player = MediaPlayer.create(this,
                Settings.System.DEFAULT_ALARM_ALERT_URI);



        if (player == null) {
            Log.e("MyCustomService", "MediaPlayer creation failed");
            return START_NOT_STICKY;
        }

        //play the ringtone audio on the loop.
        player.setLooping(true);

        player.start();

        return START_STICKY;//the system willn't recreate the service after it has been terminated by system.
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
