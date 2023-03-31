package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ng */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2660ng extends C2513jh {

    /* renamed from: i */
    private final long f14010i;

    public C2660ng(C2993wf wfVar, String str, String str2, C3063yb ybVar, long j, int i, int i2) {
        super(wfVar, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", ybVar, i, 25);
        this.f14010i = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f11604f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f11603e) {
            this.f11603e.mo15405s0(longValue);
            long j = this.f14010i;
            if (j != 0) {
                this.f11603e.mo15370L(longValue - j);
                this.f11603e.mo15371M(this.f14010i);
            }
        }
    }
}
