package com.example.maps.Utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.maps.R;

public class NotificationHelper extends ContextWrapper {
    private static final String ALI_CHANNEL_ID="com.aliriza.example.maps";
    private static final String ALI_CHANNEL_NAME="RealtimeLocation2019";

    private NotificationManager manager;

    public NotificationHelper(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            createChannel();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel aliChannel=new NotificationChannel(ALI_CHANNEL_ID,ALI_CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
        aliChannel.enableLights(false);
        aliChannel.enableVibration(true);
        aliChannel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(aliChannel);
    }

    public NotificationManager getManager() {
        if (manager==null){
            manager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        }
        return manager;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Notification.Builder getRealtimeTrackingNotification(String title, String content, Uri defaultSound) {
        return new Notification.Builder(getApplicationContext(),ALI_CHANNEL_ID)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle(title)
                .setContentText(content)
                .setSound(defaultSound)
                .setAutoCancel(false);
    }
}
