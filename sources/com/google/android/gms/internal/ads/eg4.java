package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eg4 implements kg4, jg4 {

    /* renamed from: a */
    public final mg4 f8795a;

    /* renamed from: b */
    private final long f8796b;

    /* renamed from: c */
    private og4 f8797c;

    /* renamed from: d */
    private kg4 f8798d;

    /* renamed from: e */
    private jg4 f8799e;

    /* renamed from: f */
    private long f8800f = -9223372036854775807L;

    /* renamed from: g */
    private final nk4 f8801g;

    public eg4(mg4 mg4, nk4 nk4, long j, byte[] bArr) {
        this.f8795a = mg4;
        this.f8801g = nk4;
        this.f8796b = j;
    }

    /* renamed from: r */
    private final long m12083r(long j) {
        long j2 = this.f8800f;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: U */
    public final ki4 mo8348U() {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8348U();
    }

    /* renamed from: X */
    public final void mo8349X() throws IOException {
        try {
            kg4 kg4 = this.f8798d;
            if (kg4 != null) {
                kg4.mo8349X();
                return;
            }
            og4 og4 = this.f8797c;
            if (og4 != null) {
                og4.mo9590t();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        kg4 kg4 = this.f8798d;
        return kg4 != null && kg4.mo8350a(j);
    }

    /* renamed from: b */
    public final long mo8351b() {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8351b();
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        kg4 kg4 = this.f8798d;
        return kg4 != null && kg4.mo8352b0();
    }

    /* renamed from: c */
    public final long mo8353c(xj4[] xj4Arr, boolean[] zArr, ci4[] ci4Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f8800f;
        if (j3 == -9223372036854775807L || j != this.f8796b) {
            j2 = j;
        } else {
            this.f8800f = -9223372036854775807L;
            j2 = j3;
        }
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8353c(xj4Arr, zArr, ci4Arr, zArr2, j2);
    }

    /* renamed from: d */
    public final long mo8354d() {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8354d();
    }

    /* renamed from: e */
    public final long mo8355e() {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8355e();
    }

    /* renamed from: f */
    public final long mo8356f(long j, a84 a84) {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8356f(j, a84);
    }

    /* renamed from: g */
    public final void mo8357g(long j, boolean z) {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        kg4.mo8357g(j, false);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8358h(fi4 fi4) {
        kg4 kg4 = (kg4) fi4;
        jg4 jg4 = this.f8799e;
        int i = gb2.f9812a;
        jg4.mo8358h(this);
    }

    /* renamed from: i */
    public final void mo8359i(kg4 kg4) {
        jg4 jg4 = this.f8799e;
        int i = gb2.f9812a;
        jg4.mo8359i(this);
    }

    /* renamed from: j */
    public final long mo9905j() {
        return this.f8800f;
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        kg4.mo8361j0(j);
    }

    /* renamed from: k */
    public final long mo9906k() {
        return this.f8796b;
    }

    /* renamed from: l */
    public final long mo8362l(long j) {
        kg4 kg4 = this.f8798d;
        int i = gb2.f9812a;
        return kg4.mo8362l(j);
    }

    /* renamed from: m */
    public final void mo9907m(mg4 mg4) {
        long r = m12083r(this.f8796b);
        og4 og4 = this.f8797c;
        Objects.requireNonNull(og4);
        kg4 k = og4.mo9589k(mg4, this.f8801g, r);
        this.f8798d = k;
        if (this.f8799e != null) {
            k.mo8363o(this, r);
        }
    }

    /* renamed from: n */
    public final void mo9908n(long j) {
        this.f8800f = j;
    }

    /* renamed from: o */
    public final void mo8363o(jg4 jg4, long j) {
        this.f8799e = jg4;
        kg4 kg4 = this.f8798d;
        if (kg4 != null) {
            kg4.mo8363o(this, m12083r(this.f8796b));
        }
    }

    /* renamed from: p */
    public final void mo9909p() {
        kg4 kg4 = this.f8798d;
        if (kg4 != null) {
            og4 og4 = this.f8797c;
            Objects.requireNonNull(og4);
            og4.mo9587d(kg4);
        }
    }

    /* renamed from: q */
    public final void mo9910q(og4 og4) {
        v91.m22052f(this.f8797c == null);
        this.f8797c = og4;
    }
}
