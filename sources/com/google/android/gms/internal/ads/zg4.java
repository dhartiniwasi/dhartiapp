package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zg4 implements ci4 {

    /* renamed from: a */
    private final ci4 f21083a;

    /* renamed from: b */
    private final long f21084b;

    public zg4(ci4 ci4, long j) {
        this.f21083a = ci4;
        this.f21084b = j;
    }

    /* renamed from: a */
    public final boolean mo9177a() {
        return this.f21083a.mo9177a();
    }

    /* renamed from: b */
    public final void mo9178b() throws IOException {
        this.f21083a.mo9178b();
    }

    /* renamed from: c */
    public final int mo9179c(long j) {
        return this.f21083a.mo9179c(j - this.f21084b);
    }

    /* renamed from: d */
    public final int mo9180d(c74 c74, fo3 fo3, int i) {
        int d = this.f21083a.mo9180d(c74, fo3, i);
        if (d != -4) {
            return d;
        }
        fo3.f9375e = Math.max(0, fo3.f9375e + this.f21084b);
        return -4;
    }

    /* renamed from: e */
    public final ci4 mo15592e() {
        return this.f21083a;
    }
}
