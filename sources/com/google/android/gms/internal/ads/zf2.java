package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zf2 implements tj2 {

    /* renamed from: a */
    private final AtomicReference f21076a = new AtomicReference();

    /* renamed from: b */
    private final C4691e f21077b;

    /* renamed from: c */
    private final tj2 f21078c;

    /* renamed from: d */
    private final long f21079d;

    public zf2(tj2 tj2, long j, C4691e eVar) {
        this.f21077b = eVar;
        this.f21078c = tj2;
        this.f21079d = j;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        yf2 yf2 = (yf2) this.f21076a.get();
        if (yf2 == null || yf2.mo15434a()) {
            yf2 = new yf2(this.f21078c.mo8340d(), this.f21079d, this.f21077b);
            this.f21076a.set(yf2);
        }
        return yf2.f20588a;
    }

    public final int zza() {
        return 16;
    }
}
