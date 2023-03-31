package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ta2 implements d52 {

    /* renamed from: a */
    private final i00 f17916a;

    /* renamed from: b */
    private final mf3 f17917b;

    /* renamed from: c */
    private final kx2 f17918c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final cb2 f17919d;

    public ta2(kx2 kx2, mf3 mf3, i00 i00, cb2 cb2, byte[] bArr) {
        this.f17918c = kx2;
        this.f17917b = mf3;
        this.f17916a = i00;
        this.f17919d = cb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f11003t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9436a(com.google.android.gms.internal.ads.us2 r1, com.google.android.gms.internal.ads.is2 r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.i00 r1 = r0.f17916a
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.ns2 r1 = r2.f11003t
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f14183a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta2.mo9436a(com.google.android.gms.internal.ads.us2, com.google.android.gms.internal.ads.is2):boolean");
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        in0 in0 = new in0();
        ya2 ya2 = new ya2();
        ya2.mo15355b(new sa2(this, in0, us2, is2, ya2));
        ns2 ns2 = is2.f11003t;
        d00 d00 = new d00(ya2, ns2.f14184b, ns2.f14183a);
        kx2 kx2 = this.f17918c;
        return tw2.m21277d(new ra2(this, d00), this.f17917b, ex2.CUSTOM_RENDER_SYN, kx2).mo8578b(ex2.CUSTOM_RENDER_ACK).mo8580d(in0).mo8577a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14264c(d00 d00) throws Exception {
        this.f17916a.mo10369S1(d00);
    }
}
