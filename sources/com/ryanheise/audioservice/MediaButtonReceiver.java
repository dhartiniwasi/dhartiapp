package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import p069j0.C4713a;

public class MediaButtonReceiver extends C4713a {
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || (audioService = AudioService.f36288J) == null) {
            super.onReceive(context, intent);
        } else {
            audioService.mo28990N();
        }
    }
}
