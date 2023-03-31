package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class yi4 implements qj4 {

    /* renamed from: a */
    public final /* synthetic */ jj4 f20628a;

    /* renamed from: b */
    public final /* synthetic */ String f20629b;

    public /* synthetic */ yi4(jj4 jj4, String str) {
        this.f20628a = jj4;
        this.f20629b = str;
    }

    /* renamed from: a */
    public final List mo13551a(int i, gv0 gv0, int[] iArr) {
        jj4 jj4 = this.f20628a;
        String str = this.f20629b;
        int i2 = vj4.f19125m;
        ra3 q = ua3.m21502q();
        int i3 = 0;
        while (true) {
            int i4 = gv0.f10063a;
            if (i3 > 0) {
                return q.mo13703h();
            }
            q.mo13701f(new pj4(i, gv0, i3, jj4, iArr[i3], str));
            i3++;
        }
    }
}
