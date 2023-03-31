package com.startapp.sdk.adsbase.remoteconfig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.C9029ia;
import com.startapp.C9058k0;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class BootCompleteListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Object obj = StartAppSDKInternal.f38662D;
        Context a = C9058k0.m48718a(context);
        if (a != null) {
            context = a;
        }
        StartAppSDKInternal.C9395d.f38707a.mo30568g(context);
        ComponentLocator.m50248a(context).mo31171g().execute(new C9029ia(context));
    }
}
