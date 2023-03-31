package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class pn0 {

    /* renamed from: a */
    private final in0 f15927a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f15928b = new AtomicInteger(0);

    public pn0() {
        in0 in0 = new in0();
        this.f15927a = in0;
        cf3.m10920r(in0, new nn0(this), dn0.f8330f);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo13308a() {
        return this.f15928b.get();
    }

    @Deprecated
    /* renamed from: c */
    public final void mo13309c() {
        this.f15927a.mo11173e(new Exception());
    }

    @Deprecated
    /* renamed from: d */
    public final void mo13310d(Object obj) {
        this.f15927a.mo11172d(obj);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo13311e(mn0 mn0, kn0 kn0) {
        cf3.m10920r(this.f15927a, new on0(this, mn0, kn0), dn0.f8330f);
    }
}
