package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yg4 implements kg4, jg4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final kg4 f20615a;

    /* renamed from: b */
    private final long f20616b;

    /* renamed from: c */
    private jg4 f20617c;

    public yg4(kg4 kg4, long j) {
        this.f20615a = kg4;
        this.f20616b = j;
    }

    /* renamed from: U */
    public final ki4 mo8348U() {
        return this.f20615a.mo8348U();
    }

    /* renamed from: X */
    public final void mo8349X() throws IOException {
        this.f20615a.mo8349X();
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        return this.f20615a.mo8350a(j - this.f20616b);
    }

    /* renamed from: b */
    public final long mo8351b() {
        long b = this.f20615a.mo8351b();
        if (b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return b + this.f20616b;
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        return this.f20615a.mo8352b0();
    }

    /* renamed from: c */
    public final long mo8353c(xj4[] xj4Arr, boolean[] zArr, ci4[] ci4Arr, boolean[] zArr2, long j) {
        ci4[] ci4Arr2 = ci4Arr;
        ci4[] ci4Arr3 = new ci4[ci4Arr2.length];
        int i = 0;
        while (true) {
            ci4 ci4 = null;
            if (i >= ci4Arr2.length) {
                break;
            }
            zg4 zg4 = (zg4) ci4Arr2[i];
            if (zg4 != null) {
                ci4 = zg4.mo15592e();
            }
            ci4Arr3[i] = ci4;
            i++;
        }
        long c = this.f20615a.mo8353c(xj4Arr, zArr, ci4Arr3, zArr2, j - this.f20616b);
        for (int i2 = 0; i2 < ci4Arr2.length; i2++) {
            ci4 ci42 = ci4Arr3[i2];
            if (ci42 == null) {
                ci4Arr2[i2] = null;
            } else {
                ci4 ci43 = ci4Arr2[i2];
                if (ci43 == null || ((zg4) ci43).mo15592e() != ci42) {
                    ci4Arr2[i2] = new zg4(ci42, this.f20616b);
                }
            }
        }
        return c + this.f20616b;
    }

    /* renamed from: d */
    public final long mo8354d() {
        long d = this.f20615a.mo8354d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f20616b;
    }

    /* renamed from: e */
    public final long mo8355e() {
        long e = this.f20615a.mo8355e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e + this.f20616b;
    }

    /* renamed from: f */
    public final long mo8356f(long j, a84 a84) {
        return this.f20615a.mo8356f(j - this.f20616b, a84) + this.f20616b;
    }

    /* renamed from: g */
    public final void mo8357g(long j, boolean z) {
        this.f20615a.mo8357g(j - this.f20616b, false);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8358h(fi4 fi4) {
        kg4 kg4 = (kg4) fi4;
        jg4 jg4 = this.f20617c;
        Objects.requireNonNull(jg4);
        jg4.mo8358h(this);
    }

    /* renamed from: i */
    public final void mo8359i(kg4 kg4) {
        jg4 jg4 = this.f20617c;
        Objects.requireNonNull(jg4);
        jg4.mo8359i(this);
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
        this.f20615a.mo8361j0(j - this.f20616b);
    }

    /* renamed from: l */
    public final long mo8362l(long j) {
        return this.f20615a.mo8362l(j - this.f20616b) + this.f20616b;
    }

    /* renamed from: o */
    public final void mo8363o(jg4 jg4, long j) {
        this.f20617c = jg4;
        this.f20615a.mo8363o(this, j - this.f20616b);
    }
}
