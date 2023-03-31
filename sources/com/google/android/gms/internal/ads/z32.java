package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z32 implements wa1 {
    protected z32() {
    }

    /* renamed from: a */
    public final fk1 mo14878a(Looper looper, Handler.Callback callback) {
        return new c72(new Handler(looper, callback));
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }
}
