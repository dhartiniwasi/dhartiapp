package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oa2 implements d52 {

    /* renamed from: a */
    private final Context f15018a;

    /* renamed from: b */
    private final o41 f15019b;

    /* renamed from: c */
    private final i00 f15020c;

    /* renamed from: d */
    private final mf3 f15021d;

    /* renamed from: e */
    private final kx2 f15022e;

    public oa2(Context context, o41 o41, kx2 kx2, mf3 mf3, i00 i00) {
        this.f15018a = context;
        this.f15019b = o41;
        this.f15022e = kx2;
        this.f15021d = mf3;
        this.f15020c = i00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f11003t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9436a(com.google.android.gms.internal.ads.us2 r1, com.google.android.gms.internal.ads.is2 r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.i00 r1 = r0.f15020c
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oa2.mo9436a(com.google.android.gms.internal.ads.us2, com.google.android.gms.internal.ads.is2):boolean");
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        s31 a = this.f15019b.mo8570a(new k61(us2, is2, (String) null), new ma2(this, new View(this.f15018a), (vs0) null, ka2.f11984a, (js2) is2.f11005v.get(0)));
        na2 k = a.mo13942k();
        ns2 ns2 = is2.f11003t;
        d00 d00 = new d00(k, ns2.f14184b, ns2.f14183a);
        kx2 kx2 = this.f15022e;
        return tw2.m21277d(new la2(this, d00), this.f15021d, ex2.CUSTOM_RENDER_SYN, kx2).mo8578b(ex2.CUSTOM_RENDER_ACK).mo8580d(cf3.m10911i(a.mo13939h())).mo8577a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo12885c(d00 d00) throws Exception {
        this.f15020c.mo10369S1(d00);
    }
}
