package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;

/* renamed from: com.startapp.ia */
/* compiled from: Sta */
public class C9029ia implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f36968a;

    public C9029ia(Context context) {
        this.f36968a = context;
    }

    public void run() {
        synchronized (StartAppSDKInternal.f38662D) {
            StartAppSDKInternal.m49728a(this.f36968a);
        }
    }
}
