package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.c1 */
/* compiled from: TopicsSyncTask */
class C8023c1 implements Runnable {

    /* renamed from: f */
    private static final Object f34641f = new Object();

    /* renamed from: g */
    private static Boolean f34642g;

    /* renamed from: h */
    private static Boolean f34643h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f34644a;

    /* renamed from: b */
    private final C8044i0 f34645b;

    /* renamed from: c */
    private final PowerManager.WakeLock f34646c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8019b1 f34647d;

    /* renamed from: e */
    private final long f34648e;

    /* renamed from: com.google.firebase.messaging.c1$a */
    /* compiled from: TopicsSyncTask */
    class C8024a extends BroadcastReceiver {

        /* renamed from: a */
        private C8023c1 f34649a;

        public C8024a(C8023c1 c1Var) {
            this.f34649a = c1Var;
        }

        /* renamed from: a */
        public void mo26623a() {
            if (C8023c1.m44214j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            C8023c1.this.f34644a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            C8023c1 c1Var = this.f34649a;
            if (c1Var != null) {
                if (c1Var.m44213i()) {
                    if (C8023c1.m44214j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f34649a.f34647d.mo26614m(this.f34649a, 0);
                    context.unregisterReceiver(this);
                    this.f34649a = null;
                }
            }
        }
    }

    C8023c1(C8019b1 b1Var, Context context, C8044i0 i0Var, long j) {
        this.f34647d = b1Var;
        this.f34644a = context;
        this.f34648e = j;
        this.f34645b = i0Var;
        this.f34646c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m44209e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m44210f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f34641f) {
            Boolean bool = f34643h;
            if (bool == null) {
                z = m44211g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f34643h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m44211g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m44209e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m44212h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f34641f) {
            Boolean bool = f34642g;
            if (bool == null) {
                z = m44211g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f34642g = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m44213i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f34644a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m44214j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m44212h(this.f34644a)) {
            this.f34646c.acquire(C8025d.f34651a);
        }
        try {
            this.f34647d.mo26616o(true);
            if (!this.f34645b.mo26647g()) {
                this.f34647d.mo26616o(false);
                if (m44212h(this.f34644a)) {
                    try {
                        this.f34646c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m44210f(this.f34644a) || m44213i()) {
                if (this.f34647d.mo26619s()) {
                    this.f34647d.mo26616o(false);
                } else {
                    this.f34647d.mo26620t(this.f34648e);
                }
                if (m44212h(this.f34644a)) {
                    try {
                        wakeLock = this.f34646c;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C8024a(this).mo26623a();
                if (m44212h(this.f34644a)) {
                    try {
                        this.f34646c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            this.f34647d.mo26616o(false);
            if (m44212h(this.f34644a)) {
                wakeLock = this.f34646c;
            }
        } catch (Throwable th) {
            if (m44212h(this.f34644a)) {
                try {
                    this.f34646c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
