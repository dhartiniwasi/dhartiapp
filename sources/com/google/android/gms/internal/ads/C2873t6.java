package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.t6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2873t6 {

    /* renamed from: a */
    private final C2792r f17843a;

    /* renamed from: b */
    private final SparseArray f17844b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f17845c = new SparseArray();

    /* renamed from: d */
    private final C2495j f17846d;

    /* renamed from: e */
    private final byte[] f17847e;

    /* renamed from: f */
    private int f17848f;

    /* renamed from: g */
    private long f17849g;

    /* renamed from: h */
    private long f17850h;

    /* renamed from: i */
    private final C2836s6 f17851i = new C2836s6((C2799r6) null);

    /* renamed from: j */
    private final C2836s6 f17852j = new C2836s6((C2799r6) null);

    /* renamed from: k */
    private boolean f17853k;

    /* renamed from: l */
    private long f17854l;

    /* renamed from: m */
    private long f17855m;

    /* renamed from: n */
    private boolean f17856n;

    public C2873t6(C2792r rVar, boolean z, boolean z2) {
        this.f17843a = rVar;
        byte[] bArr = new byte[128];
        this.f17847e = bArr;
        this.f17846d = new C2495j(bArr, 0, 0);
        this.f17853k = false;
    }

    /* renamed from: a */
    public final void mo14205a(C2345f fVar) {
        this.f17845c.append(fVar.f9050a, fVar);
    }

    /* renamed from: b */
    public final void mo14206b(C2383g gVar) {
        this.f17844b.append(gVar.f9618d, gVar);
    }

    /* renamed from: c */
    public final void mo14207c() {
        this.f17853k = false;
    }

    /* renamed from: d */
    public final void mo14208d(long j, int i, long j2) {
        this.f17848f = i;
        this.f17850h = j2;
        this.f17849g = j;
    }

    /* renamed from: e */
    public final boolean mo14209e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f17848f == 9) {
            if (z && this.f17853k) {
                long j2 = this.f17849g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f17855m;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.f17856n;
                    long j4 = this.f17854l;
                    this.f17843a.mo8824f(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, (C2755q) null);
                }
            }
            this.f17854l = this.f17849g;
            this.f17855m = this.f17850h;
            this.f17856n = false;
            this.f17853k = true;
        }
        boolean z5 = this.f17856n;
        int i3 = this.f17848f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f17856n = z6;
        return z6;
    }
}
