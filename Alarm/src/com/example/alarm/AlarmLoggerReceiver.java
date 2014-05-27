package com.example.alarm;
import java.text.DateFormat;
import java.util.Date;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class AlarmLoggerReceiver extends BroadcastReceiver {
	private static final String TAG = "AlarmLoggerReceiver";  
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.i(TAG,"Logging alarm at:" + DateFormat.getDateTimeInstance().format(new Date()));
	}

}
