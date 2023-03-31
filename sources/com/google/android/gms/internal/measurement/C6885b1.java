package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C6885b1 extends C6987h1 {

    /* renamed from: a */
    private final AtomicReference f31579a = new AtomicReference();

    /* renamed from: b */
    private boolean f31580b;

    /* renamed from: i5 */
    public static final Object m39571i5(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo23036B0(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f31579a
            monitor-enter(r0)
            boolean r1 = r2.f31580b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f31579a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f31579a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6885b1.mo23036B0(long):android.os.Bundle");
    }

    /* renamed from: L2 */
    public final void mo23037L2(Bundle bundle) {
        synchronized (this.f31579a) {
            try {
                this.f31579a.set(bundle);
                this.f31580b = true;
                this.f31579a.notify();
            } catch (Throwable th) {
                this.f31579a.notify();
                throw th;
            }
        }
    }

    /* renamed from: P0 */
    public final Long mo23038P0(long j) {
        return (Long) m39571i5(mo23036B0(j), Long.class);
    }

    /* renamed from: o3 */
    public final String mo23039o3(long j) {
        return (String) m39571i5(mo23036B0(j), String.class);
    }
}
