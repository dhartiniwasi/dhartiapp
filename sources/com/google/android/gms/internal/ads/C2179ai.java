package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ai */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2179ai implements C2996wi, C3033xi {

    /* renamed from: a */
    private final int f6574a;

    /* renamed from: b */
    private C3070yi f6575b;

    /* renamed from: c */
    private int f6576c;

    /* renamed from: d */
    private int f6577d;

    /* renamed from: e */
    private C2705oo f6578e;

    /* renamed from: f */
    private long f6579f;

    /* renamed from: g */
    private boolean f6580g = true;

    /* renamed from: h */
    private boolean f6581h;

    public C2179ai(int i) {
        this.f6574a = i;
    }

    /* renamed from: T */
    public final C3033xi mo8364T() {
        return this;
    }

    /* renamed from: U */
    public final C2705oo mo8365U() {
        return this.f6578e;
    }

    /* renamed from: V */
    public C2485iq mo8366V() {
        return null;
    }

    /* renamed from: W */
    public final void mo8367W() {
        boolean z = true;
        if (this.f6577d != 1) {
            z = false;
        }
        C2335eq.m12245e(z);
        this.f6577d = 0;
        this.f6578e = null;
        this.f6581h = false;
        mo8377j();
    }

    /* renamed from: c0 */
    public final void mo8368c0() throws IOException {
        this.f6578e.mo12989e();
    }

    /* renamed from: d */
    public final int mo8369d() {
        return this.f6577d;
    }

    /* renamed from: e */
    public final int mo8370e() {
        return this.f6574a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo8371f() {
        return this.f6580g ? this.f6581h : this.f6578e.mo12986a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo8372g() {
        return this.f6576c;
    }

    /* renamed from: g0 */
    public final void mo8373g0() {
        this.f6581h = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int mo8374h(C2811ri riVar, C2664nk nkVar, boolean z) {
        C2811ri riVar2 = riVar;
        C2664nk nkVar2 = nkVar;
        int c = this.f6578e.mo12988c(riVar2, nkVar2, z);
        if (c == -4) {
            if (nkVar.mo11139f()) {
                this.f6580g = true;
                return this.f6581h ? -4 : -3;
            }
            nkVar2.f14050d += this.f6579f;
        } else if (c == -5) {
            C2774qi qiVar = riVar2.f16958a;
            long j = qiVar.f16382E;
            if (j != Long.MAX_VALUE) {
                riVar2.f16958a = new C2774qi(qiVar.f16387a, qiVar.f16391e, qiVar.f16392f, qiVar.f16389c, qiVar.f16388b, qiVar.f16393g, qiVar.f16396r, qiVar.f16397s, qiVar.f16398t, qiVar.f16399u, qiVar.f16400v, qiVar.f16402x, qiVar.f16401w, qiVar.f16403y, qiVar.f16404z, qiVar.f16378A, qiVar.f16379B, qiVar.f16380C, qiVar.f16381D, qiVar.f16383F, qiVar.f16384G, qiVar.f16385H, j + this.f6579f, qiVar.f16394h, qiVar.f16395i, qiVar.f16390d);
                return -5;
            }
        }
        return c;
    }

    /* renamed from: h0 */
    public final boolean mo8375h0() {
        return this.f6580g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C3070yi mo8376i() {
        return this.f6575b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo8377j();

    /* renamed from: j0 */
    public final void mo8378j0() throws C2253ci {
        C2335eq.m12245e(this.f6577d == 2);
        this.f6577d = 1;
        mo8384n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo8379k(boolean z) throws C2253ci;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo8380l(long j, boolean z) throws C2253ci;

    /* renamed from: l0 */
    public final boolean mo8381l0() {
        return this.f6581h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo8382m() throws C2253ci;

    /* renamed from: m0 */
    public final void mo8383m0() throws C2253ci {
        boolean z = true;
        if (this.f6577d != 1) {
            z = false;
        }
        C2335eq.m12245e(z);
        this.f6577d = 2;
        mo8382m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo8384n() throws C2253ci;

    /* renamed from: n0 */
    public final void mo8385n0(int i) {
        this.f6576c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8386o(C2774qi[] qiVarArr, long j) throws C2253ci {
    }

    /* renamed from: o0 */
    public final void mo8387o0(C2774qi[] qiVarArr, C2705oo ooVar, long j) throws C2253ci {
        C2335eq.m12245e(!this.f6581h);
        this.f6578e = ooVar;
        this.f6580g = false;
        this.f6579f = j;
        mo8386o(qiVarArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo8388p(long j) {
        this.f6578e.mo12987b(j - this.f6579f);
    }

    /* renamed from: p0 */
    public final void mo8389p0(long j) throws C2253ci {
        this.f6581h = false;
        this.f6580g = false;
        mo8380l(j, false);
    }

    /* renamed from: q0 */
    public final void mo8390q0(C3070yi yiVar, C2774qi[] qiVarArr, C2705oo ooVar, long j, boolean z, long j2) throws C2253ci {
        C2335eq.m12245e(this.f6577d == 0);
        this.f6575b = yiVar;
        this.f6577d = 1;
        mo8379k(z);
        mo8387o0(qiVarArr, ooVar, j2);
        mo8380l(j, z);
    }
}
