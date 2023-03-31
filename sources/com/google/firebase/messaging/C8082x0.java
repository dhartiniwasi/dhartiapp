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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p074j5.C4831a;

/* renamed from: com.google.firebase.messaging.x0 */
/* compiled from: SyncTask */
class C8082x0 implements Runnable {

    /* renamed from: a */
    private final long f34783a;

    /* renamed from: b */
    private final PowerManager.WakeLock f34784b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final FirebaseMessaging f34785c;

    /* renamed from: d */
    ExecutorService f34786d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4831a("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.x0$a */
    /* compiled from: SyncTask */
    static class C8083a extends BroadcastReceiver {

        /* renamed from: a */
        private C8082x0 f34787a;

        public C8083a(C8082x0 x0Var) {
            this.f34787a = x0Var;
        }

        /* renamed from: a */
        public void mo26752a() {
            if (C8082x0.m44455c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f34787a.mo26748b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C8082x0 x0Var = this.f34787a;
            if (x0Var != null && x0Var.mo26749d()) {
                if (C8082x0.m44455c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f34787a.f34785c.mo26584p(this.f34787a, 0);
                this.f34787a.mo26748b().unregisterReceiver(this);
                this.f34787a = null;
            }
        }
    }

    public C8082x0(FirebaseMessaging firebaseMessaging, long j) {
        this.f34785c = firebaseMessaging;
        this.f34783a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo26748b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f34784b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m44455c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo26748b() {
        return this.f34785c.mo26585q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26749d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo26748b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo26750e() throws IOException {
        try {
            if (this.f34785c.mo26582n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C8027d0.m44222h(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (C8073t0.m44426b().mo26732e(mo26748b())) {
            this.f34784b.acquire();
        }
        try {
            this.f34785c.mo26577O(true);
            if (!this.f34785c.mo26589z()) {
                this.f34785c.mo26577O(false);
                if (C8073t0.m44426b().mo26732e(mo26748b())) {
                    this.f34784b.release();
                }
            } else if (!C8073t0.m44426b().mo26731d(mo26748b()) || mo26749d()) {
                if (mo26750e()) {
                    this.f34785c.mo26577O(false);
                } else {
                    this.f34785c.mo26579S(this.f34783a);
                }
                if (!C8073t0.m44426b().mo26732e(mo26748b())) {
                    return;
                }
                this.f34784b.release();
            } else {
                new C8083a(this).mo26752a();
                if (C8073t0.m44426b().mo26732e(mo26748b())) {
                    this.f34784b.release();
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.f34785c.mo26577O(false);
            if (!C8073t0.m44426b().mo26732e(mo26748b())) {
            }
        } catch (Throwable th) {
            if (C8073t0.m44426b().mo26732e(mo26748b())) {
                this.f34784b.release();
            }
            throw th;
        }
    }
}
