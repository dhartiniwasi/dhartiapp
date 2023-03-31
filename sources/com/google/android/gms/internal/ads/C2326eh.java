package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.eh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2326eh extends C2513jh {

    /* renamed from: i */
    private static volatile Long f8802i;

    /* renamed from: j */
    private static final Object f8803j = new Object();

    public C2326eh(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", ybVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        if (f8802i == null) {
            synchronized (f8803j) {
                if (f8802i == null) {
                    f8802i = (Long) this.f11604f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f11603e) {
            this.f11603e.mo15372N(f8802i.longValue());
        }
    }
}
