package com.enjamamulhoque.broadcastreceiverfeature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();

        if(isAirplaneModeOn(context.getApplicationContext())){
            Toast.makeText(context, "Airplane is ON", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "Airplane is OFF", Toast.LENGTH_SHORT).show();
        }

    }

    private static boolean isAirplaneModeOn(Context context){

        return (Settings.System.getInt(context.getContentResolver(), Settings.System.AIRPLANE_MODE_ON, 0) != 0);

    }
}
