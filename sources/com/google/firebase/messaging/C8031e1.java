package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p209d6.C9865a;

/* renamed from: com.google.firebase.messaging.e1 */
/* compiled from: WakeLockHolder */
final class C8031e1 {

    /* renamed from: a */
    static final long f34664a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f34665b = new Object();

    /* renamed from: c */
    private static C9865a f34666c;

    /* renamed from: b */
    private static void m44237b(Context context) {
        if (f34666c == null) {
            C9865a aVar = new C9865a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f34666c = aVar;
            aVar.mo32321d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m44238c(Intent intent) {
        synchronized (f34665b) {
            if (f34666c != null && m44239d(intent)) {
                m44242g(intent, false);
                f34666c.mo32320c();
            }
        }
    }

    /* renamed from: d */
    static boolean m44239d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    static void m44241f(Context context, C8048j1 j1Var, Intent intent) {
        synchronized (f34665b) {
            m44237b(context);
            boolean d = m44239d(intent);
            m44242g(intent, true);
            if (!d) {
                f34666c.mo32318a(f34664a);
            }
            j1Var.mo26668c(intent).mo26347b(new C8028d1(intent));
        }
    }

    /* renamed from: g */
    private static void m44242g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName m44243h(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f34665b
            monitor-enter(r0)
            m44237b(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m44239d(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m44242g(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            d6.a r4 = f34666c     // Catch:{ all -> 0x0022 }
            long r1 = f34664a     // Catch:{ all -> 0x0022 }
            r4.mo32318a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8031e1.m44243h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
