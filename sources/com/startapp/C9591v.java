package com.startapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.startapp.v */
/* compiled from: Sta */
public class C9591v implements ServiceConnection {

    /* renamed from: a */
    public final LinkedBlockingQueue<IBinder> f39267a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    public boolean f39268b = false;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f39267a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
