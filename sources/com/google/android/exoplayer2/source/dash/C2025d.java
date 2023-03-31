package com.google.android.exoplayer2.source.dash;

import java.io.IOException;
import p015b3.C1749q0;
import p021c2.C1848g;
import p045f3.C4261f;
import p141t2.C5510c;
import p161w3.C5953m0;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: com.google.android.exoplayer2.source.dash.d */
/* compiled from: EventSampleStream */
final class C2025d implements C1749q0 {

    /* renamed from: a */
    private final C6272r1 f5842a;

    /* renamed from: b */
    private final C5510c f5843b = new C5510c();

    /* renamed from: c */
    private long[] f5844c;

    /* renamed from: d */
    private boolean f5845d;

    /* renamed from: e */
    private C4261f f5846e;

    /* renamed from: f */
    private boolean f5847f;

    /* renamed from: g */
    private int f5848g;

    /* renamed from: h */
    private long f5849h = -9223372036854775807L;

    public C2025d(C4261f fVar, C6272r1 r1Var, boolean z) {
        this.f5842a = r1Var;
        this.f5846e = fVar;
        this.f5844c = fVar.f23678b;
        mo7778d(fVar, z);
    }

    /* renamed from: a */
    public String mo7776a() {
        return this.f5846e.mo17677a();
    }

    /* renamed from: b */
    public void mo6700b() throws IOException {
    }

    /* renamed from: c */
    public void mo7777c(long j) {
        boolean z = true;
        int e = C5953m0.m35128e(this.f5844c, j, true, false);
        this.f5848g = e;
        if (!this.f5845d || e != this.f5844c.length) {
            z = false;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f5849h = j;
    }

    /* renamed from: d */
    public void mo7778d(C4261f fVar, boolean z) {
        int i = this.f5848g;
        long j = i == 0 ? -9223372036854775807L : this.f5844c[i - 1];
        this.f5845d = z;
        this.f5846e = fVar;
        long[] jArr = fVar.f23678b;
        this.f5844c = jArr;
        long j2 = this.f5849h;
        if (j2 != -9223372036854775807L) {
            mo7777c(j2);
        } else if (j != -9223372036854775807L) {
            this.f5848g = C5953m0.m35128e(jArr, j, false, false);
        }
    }

    /* renamed from: f */
    public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
        int i2 = this.f5848g;
        boolean z = i2 == this.f5844c.length;
        if (z && !this.f5845d) {
            gVar.mo7037v(4);
            return -4;
        } else if ((i & 2) != 0 || !this.f5847f) {
            s1Var.f30328b = this.f5842a;
            this.f5847f = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.f5848g = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] a = this.f5843b.mo19791a(this.f5846e.f23677a[i2]);
                gVar.mo7050x(a.length);
                gVar.f5430c.put(a);
            }
            gVar.f5432e = this.f5844c[i2];
            gVar.mo7037v(1);
            return -4;
        }
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: l */
    public int mo6703l(long j) {
        int max = Math.max(this.f5848g, C5953m0.m35128e(this.f5844c, j, true, false));
        int i = max - this.f5848g;
        this.f5848g = max;
        return i;
    }
}
