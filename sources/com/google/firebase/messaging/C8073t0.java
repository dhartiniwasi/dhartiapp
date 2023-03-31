package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.t0 */
/* compiled from: ServiceStarter */
public class C8073t0 {

    /* renamed from: e */
    private static C8073t0 f34762e;

    /* renamed from: a */
    private String f34763a = null;

    /* renamed from: b */
    private Boolean f34764b = null;

    /* renamed from: c */
    private Boolean f34765c = null;

    /* renamed from: d */
    private final Queue<Intent> f34766d = new ArrayDeque();

    private C8073t0() {
    }

    /* renamed from: a */
    private int m44425a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m44427f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo26732e(context)) {
                componentName = C8031e1.m44243h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
            return 402;
        }
    }

    /* renamed from: b */
    static synchronized C8073t0 m44426b() {
        C8073t0 t0Var;
        synchronized (C8073t0.class) {
            if (f34762e == null) {
                f34762e = new C8073t0();
            }
            t0Var = f34762e;
        }
        return t0Var;
    }

    /* renamed from: f */
    private synchronized String m44427f(Context context, Intent intent) {
        String str = this.f34763a;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str2 = serviceInfo.name;
                    if (str2 != null) {
                        if (str2.startsWith(".")) {
                            this.f34763a = context.getPackageName() + serviceInfo.name;
                        } else {
                            this.f34763a = serviceInfo.name;
                        }
                        return this.f34763a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent mo26730c() {
        return this.f34766d.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26731d(Context context) {
        if (this.f34765c == null) {
            this.f34765c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f34764b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f34765c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo26732e(Context context) {
        if (this.f34764b == null) {
            this.f34764b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f34764b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f34764b.booleanValue();
    }

    /* renamed from: g */
    public int mo26733g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f34766d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m44425a(context, intent2);
    }
}
