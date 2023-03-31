package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ah */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2178ah extends C2513jh {

    /* renamed from: i */
    private final boolean f6558i;

    public C2178ah(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", ybVar, i, 61);
        this.f6558i = wfVar.mo14916s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f11604f.invoke((Object) null, new Object[]{this.f11600b.mo14902b(), Boolean.valueOf(this.f6558i)})).longValue();
        synchronized (this.f11603e) {
            this.f11603e.mo15408v(longValue);
        }
    }
}
