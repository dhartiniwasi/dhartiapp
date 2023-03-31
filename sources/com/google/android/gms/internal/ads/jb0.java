package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class jb0 {

    /* renamed from: b */
    private static jb0 f11303b;

    /* renamed from: a */
    private final AtomicBoolean f11304a = new AtomicBoolean(false);

    jb0() {
    }

    /* renamed from: a */
    public static jb0 m14797a() {
        if (f11303b == null) {
            f11303b = new jb0();
        }
        return f11303b;
    }

    /* renamed from: b */
    public final Thread mo11374b(Context context, String str) {
        if (!this.f11304a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new ib0(this, context, str));
        thread.start();
        return thread;
    }
}
