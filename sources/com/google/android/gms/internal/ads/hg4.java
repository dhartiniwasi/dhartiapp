package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hg4 extends uf4 {

    /* renamed from: k */
    private final og4 f10318k;

    /* renamed from: l */
    private final boolean f10319l;

    /* renamed from: m */
    private final fs0 f10320m;

    /* renamed from: n */
    private final dq0 f10321n;

    /* renamed from: o */
    private fg4 f10322o;

    /* renamed from: p */
    private eg4 f10323p;

    /* renamed from: q */
    private boolean f10324q;

    /* renamed from: r */
    private boolean f10325r;

    /* renamed from: s */
    private boolean f10326s;

    public hg4(og4 og4, boolean z) {
        boolean z2;
        this.f10318k = og4;
        if (z) {
            og4.mo12332j();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f10319l = z2;
        this.f10320m = new fs0();
        this.f10321n = new dq0();
        og4.mo12336o();
        this.f10322o = fg4.m12605q(og4.mo9588j0());
    }

    /* renamed from: E */
    private final Object m13841E(Object obj) {
        return (this.f10322o.f9277e == null || !obj.equals(fg4.f9275f)) ? obj : this.f10322o.f9277e;
    }

    /* renamed from: F */
    private final void m13842F(long j) {
        eg4 eg4 = this.f10323p;
        int a = this.f10322o.mo8899a(eg4.f8795a.f12629a);
        if (a != -1) {
            fg4 fg4 = this.f10322o;
            dq0 dq0 = this.f10321n;
            fg4.mo8902d(a, dq0, false);
            long j2 = dq0.f8362d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            eg4.mo9908n(j);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo9586A(java.lang.Object r13, com.google.android.gms.internal.ads.og4 r14, com.google.android.gms.internal.ads.gt0 r15) {
        /*
            r12 = this;
            java.lang.Void r13 = (java.lang.Void) r13
            boolean r13 = r12.f10325r
            r14 = 0
            if (r13 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.fg4 r13 = r12.f10322o
            com.google.android.gms.internal.ads.fg4 r13 = r13.mo10162p(r15)
            r12.f10322o = r13
            com.google.android.gms.internal.ads.eg4 r13 = r12.f10323p
            if (r13 == 0) goto L_0x009d
            long r0 = r13.mo9905j()
            r12.m13842F(r0)
            goto L_0x009d
        L_0x001c:
            boolean r13 = r15.mo10643o()
            if (r13 == 0) goto L_0x0038
            boolean r13 = r12.f10326s
            if (r13 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.fg4 r13 = r12.f10322o
            com.google.android.gms.internal.ads.fg4 r13 = r13.mo10162p(r15)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r13 = com.google.android.gms.internal.ads.fs0.f9422o
            java.lang.Object r0 = com.google.android.gms.internal.ads.fg4.f9275f
            com.google.android.gms.internal.ads.fg4 r13 = com.google.android.gms.internal.ads.fg4.m12606r(r15, r13, r0)
        L_0x0035:
            r12.f10322o = r13
            goto L_0x009d
        L_0x0038:
            com.google.android.gms.internal.ads.fs0 r13 = r12.f10320m
            r0 = 0
            r1 = 0
            r15.mo8903e(r0, r13, r1)
            com.google.android.gms.internal.ads.fs0 r13 = r12.f10320m
            java.lang.Object r13 = r13.f9426a
            com.google.android.gms.internal.ads.eg4 r3 = r12.f10323p
            if (r3 == 0) goto L_0x0064
            long r4 = r3.mo9906k()
            com.google.android.gms.internal.ads.fg4 r6 = r12.f10322o
            com.google.android.gms.internal.ads.mg4 r3 = r3.f8795a
            java.lang.Object r3 = r3.f12629a
            com.google.android.gms.internal.ads.dq0 r7 = r12.f10321n
            r6.mo10608n(r3, r7)
            com.google.android.gms.internal.ads.fg4 r3 = r12.f10322o
            com.google.android.gms.internal.ads.fs0 r6 = r12.f10320m
            r3.mo8903e(r0, r6, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            r10 = r4
            goto L_0x0065
        L_0x0064:
            r10 = r1
        L_0x0065:
            com.google.android.gms.internal.ads.fs0 r7 = r12.f10320m
            com.google.android.gms.internal.ads.dq0 r8 = r12.f10321n
            r9 = 0
            r6 = r15
            android.util.Pair r0 = r6.mo10641l(r7, r8, r9, r10)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r12.f10326s
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.internal.ads.fg4 r13 = r12.f10322o
            com.google.android.gms.internal.ads.fg4 r13 = r13.mo10162p(r15)
            goto L_0x0088
        L_0x0084:
            com.google.android.gms.internal.ads.fg4 r13 = com.google.android.gms.internal.ads.fg4.m12606r(r15, r13, r1)
        L_0x0088:
            r12.f10322o = r13
            com.google.android.gms.internal.ads.eg4 r13 = r12.f10323p
            if (r13 == 0) goto L_0x009d
            r12.m13842F(r2)
            com.google.android.gms.internal.ads.mg4 r13 = r13.f8795a
            java.lang.Object r14 = r13.f12629a
            java.lang.Object r14 = r12.m13841E(r14)
            com.google.android.gms.internal.ads.mg4 r14 = r13.mo12346c(r14)
        L_0x009d:
            r13 = 1
            r12.f10326s = r13
            r12.f10325r = r13
            com.google.android.gms.internal.ads.fg4 r13 = r12.f10322o
            r12.mo12342w(r13)
            if (r14 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.eg4 r13 = r12.f10323p
            java.util.Objects.requireNonNull(r13)
            r13.mo9907m(r14)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hg4.mo9586A(java.lang.Object, com.google.android.gms.internal.ads.og4, com.google.android.gms.internal.ads.gt0):void");
    }

    /* renamed from: C */
    public final gt0 mo10811C() {
        return this.f10322o;
    }

    /* renamed from: D */
    public final eg4 mo9589k(mg4 mg4, nk4 nk4, long j) {
        eg4 eg4 = new eg4(mg4, nk4, j, (byte[]) null);
        eg4.mo9910q(this.f10318k);
        if (this.f10325r) {
            eg4.mo9907m(mg4.mo12346c(m13841E(mg4.f12629a)));
        } else {
            this.f10323p = eg4;
            if (!this.f10324q) {
                this.f10324q = true;
                mo14509B((Object) null, this.f10318k);
            }
        }
        return eg4;
    }

    /* renamed from: d */
    public final void mo9587d(kg4 kg4) {
        ((eg4) kg4).mo9909p();
        if (kg4 == this.f10323p) {
            this.f10323p = null;
        }
    }

    /* renamed from: j0 */
    public final C2453hw mo9588j0() {
        return this.f10318k.mo9588j0();
    }

    /* renamed from: t */
    public final void mo9590t() {
    }

    /* renamed from: v */
    public final void mo9591v(ve3 ve3) {
        super.mo9591v(ve3);
        if (!this.f10319l) {
            this.f10324q = true;
            mo14509B((Object) null, this.f10318k);
        }
    }

    /* renamed from: x */
    public final void mo9592x() {
        this.f10325r = false;
        this.f10324q = false;
        super.mo9592x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ mg4 mo9593z(Object obj, mg4 mg4) {
        Void voidR = (Void) obj;
        Object obj2 = mg4.f12629a;
        if (this.f10322o.f9277e != null && this.f10322o.f9277e.equals(obj2)) {
            obj2 = fg4.f9275f;
        }
        return mg4.mo12346c(obj2);
    }
}
