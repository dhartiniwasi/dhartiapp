package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uh4 implements hk4 {

    /* renamed from: a */
    public long f18539a;

    /* renamed from: b */
    public long f18540b;

    /* renamed from: c */
    public gk4 f18541c;

    /* renamed from: d */
    public uh4 f18542d;

    public uh4(long j, int i) {
        mo14518d(j, 65536);
    }

    /* renamed from: a */
    public final int mo14516a(long j) {
        long j2 = this.f18539a;
        int i = this.f18541c.f9948b;
        return (int) (j - j2);
    }

    /* renamed from: b */
    public final hk4 mo10832b() {
        uh4 uh4 = this.f18542d;
        if (uh4 == null || uh4.f18541c == null) {
            return null;
        }
        return uh4;
    }

    /* renamed from: c */
    public final uh4 mo14517c() {
        this.f18541c = null;
        uh4 uh4 = this.f18542d;
        this.f18542d = null;
        return uh4;
    }

    /* renamed from: d */
    public final void mo14518d(long j, int i) {
        v91.m22052f(this.f18541c == null);
        this.f18539a = j;
        this.f18540b = j + 65536;
    }

    /* renamed from: e */
    public final gk4 mo10833e() {
        gk4 gk4 = this.f18541c;
        Objects.requireNonNull(gk4);
        return gk4;
    }
}
