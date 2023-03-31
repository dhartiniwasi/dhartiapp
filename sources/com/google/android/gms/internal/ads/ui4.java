package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ui4 implements qj4 {

    /* renamed from: a */
    public final /* synthetic */ vj4 f18558a;

    /* renamed from: b */
    public final /* synthetic */ jj4 f18559b;

    /* renamed from: c */
    public final /* synthetic */ boolean f18560c;

    public /* synthetic */ ui4(vj4 vj4, jj4 jj4, boolean z) {
        this.f18558a = vj4;
        this.f18559b = jj4;
        this.f18560c = z;
    }

    /* renamed from: a */
    public final List mo13551a(int i, gv0 gv0, int[] iArr) {
        vj4 vj4 = this.f18558a;
        jj4 jj4 = this.f18559b;
        boolean z = this.f18560c;
        ti4 ti4 = new ti4(vj4);
        ra3 q = ua3.m21502q();
        gv0 gv02 = gv0;
        int i2 = 0;
        while (true) {
            int i3 = gv02.f10063a;
            if (i2 > 0) {
                return q.mo13703h();
            }
            q.mo13701f(new cj4(i, gv0, i2, jj4, iArr[i2], z, ti4));
            i2++;
        }
    }
}
