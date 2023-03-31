package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.iid.v */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class C7992v implements Runnable {

    /* renamed from: a */
    private final long f34531a;

    /* renamed from: b */
    private final PowerManager.WakeLock f34532b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final FirebaseInstanceId f34533c;

    /* renamed from: d */
    ExecutorService f34534d = C7970b.m43967b();

    /* renamed from: com.google.firebase.iid.v$a */
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class C7993a extends BroadcastReceiver {

        /* renamed from: a */
        private C7992v f34535a;

        public C7993a(C7992v vVar) {
            this.f34535a = vVar;
        }

        /* renamed from: a */
        public void mo26549a() {
            if (FirebaseInstanceId.m43933q()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f34535a.mo26545b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C7992v vVar = this.f34535a;
            if (vVar != null && vVar.mo26546c()) {
                if (FirebaseInstanceId.m43933q()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f34535a.f34533c.mo26504g(this.f34535a, 0);
                this.f34535a.mo26545b().unregisterReceiver(this);
                this.f34535a = null;
            }
        }
    }

    C7992v(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f34533c = firebaseInstanceId;
        this.f34531a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo26545b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f34532b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo26545b() {
        return this.f34533c.mo26506h().mo33469m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo26546c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo26545b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26547d() throws IOException {
        if (!this.f34533c.mo26500E(this.f34533c.mo26510o())) {
            return true;
        }
        try {
            if (this.f34533c.mo26502d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e) {
            if (C7979k.m43977g(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (C7989t.m43999a().mo26537c(mo26545b())) {
            this.f34532b.acquire();
        }
        try {
            this.f34533c.mo26497B(true);
            if (!this.f34533c.mo26512r()) {
                this.f34533c.mo26497B(false);
                if (!C7989t.m43999a().mo26537c(mo26545b())) {
                    return;
                }
            } else if (!C7989t.m43999a().mo26536b(mo26545b()) || mo26546c()) {
                if (mo26547d()) {
                    this.f34533c.mo26497B(false);
                } else {
                    this.f34533c.mo26499D(this.f34531a);
                }
                if (!C7989t.m43999a().mo26537c(mo26545b())) {
                    return;
                }
            } else {
                new C7993a(this).mo26549a();
                if (!C7989t.m43999a().mo26537c(mo26545b())) {
                    return;
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f34533c.mo26497B(false);
            if (!C7989t.m43999a().mo26537c(mo26545b())) {
                return;
            }
        } catch (Throwable th) {
            if (C7989t.m43999a().mo26537c(mo26545b())) {
                this.f34532b.release();
            }
            throw th;
        }
        this.f34532b.release();
    }
}
