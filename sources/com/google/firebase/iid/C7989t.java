package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.firebase.iid.t */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class C7989t {

    /* renamed from: c */
    private static C7989t f34521c;

    /* renamed from: a */
    private Boolean f34522a = null;

    /* renamed from: b */
    private Boolean f34523b = null;

    private C7989t() {
    }

    /* renamed from: a */
    public static synchronized C7989t m43999a() {
        C7989t tVar;
        synchronized (C7989t.class) {
            if (f34521c == null) {
                f34521c = new C7989t();
            }
            tVar = f34521c;
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo26536b(Context context) {
        if (this.f34523b == null) {
            this.f34523b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f34522a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f34523b.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo26537c(Context context) {
        if (this.f34522a == null) {
            this.f34522a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f34522a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f34522a.booleanValue();
    }
}
