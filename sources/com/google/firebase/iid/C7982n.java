package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import p246h7.C10412f;

/* renamed from: com.google.firebase.iid.n */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class C7982n {

    /* renamed from: a */
    private final Context f34509a;

    /* renamed from: b */
    private String f34510b;

    /* renamed from: c */
    private String f34511c;

    /* renamed from: d */
    private int f34512d;

    /* renamed from: e */
    private int f34513e = 0;

    public C7982n(Context context) {
        this.f34509a = context;
    }

    /* renamed from: c */
    public static String m43985c(C10412f fVar) {
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
    private PackageInfo m43986f(String str) {
        try {
            return this.f34509a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m43987h() {
        PackageInfo f = m43986f(this.f34509a.getPackageName());
        if (f != null) {
            this.f34510b = Integer.toString(f.versionCode);
            this.f34511c = f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String mo26529a() {
        if (this.f34510b == null) {
            m43987h();
        }
        return this.f34510b;
    }

    /* renamed from: b */
    public synchronized String mo26530b() {
        if (this.f34511c == null) {
            m43987h();
        }
        return this.f34511c;
    }

    /* renamed from: d */
    public synchronized int mo26531d() {
        PackageInfo f;
        if (this.f34512d == 0 && (f = m43986f("com.google.android.gms")) != null) {
            this.f34512d = f.versionCode;
        }
        return this.f34512d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        return r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo26532e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f34513e     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f34509a     // Catch:{ all -> 0x0079 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x0079 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0022
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r3
        L_0x0022:
            boolean r1 = p067i5.C4699m.m30418i()     // Catch:{ all -> 0x0079 }
            r2 = 1
            if (r1 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0046
            int r1 = r1.size()     // Catch:{ all -> 0x0079 }
            if (r1 > 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r5.f34513e = r2     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r2
        L_0x0046:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0079 }
            r1 = 2
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()     // Catch:{ all -> 0x0079 }
            if (r0 > 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r5.f34513e = r1     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0079 }
            boolean r0 = p067i5.C4699m.m30418i()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0075
            r5.f34513e = r1     // Catch:{ all -> 0x0079 }
            r2 = 2
            goto L_0x0077
        L_0x0075:
            r5.f34513e = r2     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)
            return r2
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C7982n.mo26532e():int");
    }

    /* renamed from: g */
    public boolean mo26533g() {
        return mo26532e() != 0;
    }
}
