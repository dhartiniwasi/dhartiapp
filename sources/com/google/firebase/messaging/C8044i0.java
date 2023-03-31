package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p067i5.C4699m;
import p246h7.C10412f;

/* renamed from: com.google.firebase.messaging.i0 */
/* compiled from: Metadata */
class C8044i0 {

    /* renamed from: a */
    private final Context f34687a;

    /* renamed from: b */
    private String f34688b;

    /* renamed from: c */
    private String f34689c;

    /* renamed from: d */
    private int f34690d;

    /* renamed from: e */
    private int f34691e = 0;

    C8044i0(Context context) {
        this.f34687a = context;
    }

    /* renamed from: c */
    static String m44300c(C10412f fVar) {
        String f = fVar.mo33471r().mo33484f();
        if (f != null) {
            return f;
        }
        String c = fVar.mo33471r().mo33480c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m44301f(String str) {
        try {
            return this.f34687a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m44302h() {
        PackageInfo f = m44301f(this.f34687a.getPackageName());
        if (f != null) {
            this.f34688b = Integer.toString(f.versionCode);
            this.f34689c = f.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo26643a() {
        if (this.f34688b == null) {
            m44302h();
        }
        return this.f34688b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String mo26644b() {
        if (this.f34689c == null) {
            m44302h();
        }
        return this.f34689c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int mo26645d() {
        PackageInfo f;
        if (this.f34690d == 0 && (f = m44301f("com.google.android.gms")) != null) {
            this.f34690d = f.versionCode;
        }
        return this.f34690d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int mo26646e() {
        int i = this.f34691e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f34687a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C4699m.m30418i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f34691e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (C4699m.m30418i()) {
                this.f34691e = 2;
            } else {
                this.f34691e = 1;
            }
            return this.f34691e;
        }
        this.f34691e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo26647g() {
        return mo26646e() != 0;
    }
}
