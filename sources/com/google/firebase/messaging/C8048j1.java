package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p061h5.C4626a;
import p074j5.C4831a;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: com.google.firebase.messaging.j1 */
/* compiled from: WithinAppServiceConnection */
class C8048j1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f34695a;

    /* renamed from: b */
    private final Intent f34696b;

    /* renamed from: c */
    private final ScheduledExecutorService f34697c;

    /* renamed from: d */
    private final Queue<C8049a> f34698d;

    /* renamed from: e */
    private C8037g1 f34699e;

    /* renamed from: f */
    private boolean f34700f;

    /* renamed from: com.google.firebase.messaging.j1$a */
    /* compiled from: WithinAppServiceConnection */
    static class C8049a {

        /* renamed from: a */
        final Intent f34701a;

        /* renamed from: b */
        private final C9977j<Void> f34702b = new C9977j<>();

        C8049a(Intent intent) {
            this.f34701a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m44341f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f34701a.getAction() + " Releasing WakeLock.");
            mo26672d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo26671c(ScheduledExecutorService scheduledExecutorService) {
            mo26673e().mo26348c(scheduledExecutorService, new C8042h1(scheduledExecutorService.schedule(new C8045i1(this), (this.f34701a.getFlags() & 268435456) != 0 ? C8031e1.f34664a : 9000, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo26672d() {
            this.f34702b.mo32546e(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C9975i<Void> mo26673e() {
            return this.f34702b.mo32542a();
        }
    }

    C8048j1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C4831a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m44335a() {
        while (!this.f34698d.isEmpty()) {
            this.f34698d.poll().mo26672d();
        }
    }

    /* renamed from: b */
    private synchronized void m44336b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f34698d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            C8037g1 g1Var = this.f34699e;
            if (g1Var == null || !g1Var.isBinderAlive()) {
                m44337d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f34699e.mo26636c(this.f34698d.poll());
        }
    }

    /* renamed from: d */
    private void m44337d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f34700f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f34700f) {
            this.f34700f = true;
            try {
                if (!C4626a.m30143b().mo18191a(this.f34695a, this.f34696b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f34700f = false;
                    m44335a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C9975i<Void> mo26668c(Intent intent) {
        C8049a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C8049a(intent);
        aVar.mo26671c(this.f34697c);
        this.f34698d.add(aVar);
        m44336b();
        return aVar.mo26673e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f34700f = false;
        if (!(iBinder instanceof C8037g1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m44335a();
            return;
        }
        this.f34699e = (C8037g1) iBinder;
        m44336b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m44336b();
    }

    C8048j1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f34698d = new ArrayDeque();
        this.f34700f = false;
        Context applicationContext = context.getApplicationContext();
        this.f34695a = applicationContext;
        this.f34696b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f34697c = scheduledExecutorService;
    }
}
