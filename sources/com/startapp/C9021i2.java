package com.startapp;

import android.content.Context;

/* renamed from: com.startapp.i2 */
/* compiled from: Sta */
public abstract class C9021i2<T> {

    /* renamed from: a */
    public final Context f36944a;

    /* renamed from: b */
    public volatile T f36945b;

    /* renamed from: c */
    public volatile long f36946c;

    /* renamed from: d */
    public final long f36947d;

    public C9021i2(Context context) {
        this(context, 900000);
    }

    /* renamed from: a */
    public T mo29086a() {
        return null;
    }

    /* renamed from: a */
    public T mo29457a(boolean z) {
        return mo29086a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r8.f36946c + r8.f36947d < android.os.SystemClock.uptimeMillis()) != false) goto L_0x0018;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo29469b() {
        /*
            r8 = this;
            T r0 = r8.f36945b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            long r3 = r8.f36946c
            long r5 = r8.f36947d
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x004b
        L_0x0018:
            monitor-enter(r8)
            T r0 = r8.f36945b     // Catch:{ all -> 0x0053 }
            long r3 = r8.f36946c     // Catch:{ all -> 0x0053 }
            long r5 = r8.f36947d     // Catch:{ all -> 0x0053 }
            long r3 = r3 + r5
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0053 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x004a
        L_0x002e:
            java.lang.Object r0 = r8.mo29457a(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0040
        L_0x0033:
            r1 = move-exception
            java.lang.Class<android.os.RemoteException> r2 = android.os.RemoteException.class
            boolean r2 = com.startapp.C9605vb.m50466a((java.lang.Throwable) r1, (java.lang.Class<? extends java.lang.Throwable>) r2)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0053 }
        L_0x0040:
            if (r0 == 0) goto L_0x004a
            r8.f36945b = r0     // Catch:{ all -> 0x0053 }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0053 }
            r8.f36946c = r1     // Catch:{ all -> 0x0053 }
        L_0x004a:
            monitor-exit(r8)     // Catch:{ all -> 0x0053 }
        L_0x004b:
            if (r0 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.Object r0 = r8.mo29309c()
        L_0x0052:
            return r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9021i2.mo29469b():java.lang.Object");
    }

    /* renamed from: c */
    public abstract T mo29309c();

    public C9021i2(Context context, long j) {
        this.f36944a = context;
        this.f36947d = j;
    }
}
