package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pj4 extends rj4 implements Comparable {

    /* renamed from: e */
    private final int f15877e;

    /* renamed from: f */
    private final boolean f15878f;

    /* renamed from: g */
    private final boolean f15879g;

    /* renamed from: h */
    private final boolean f15880h;

    /* renamed from: i */
    private final int f15881i;

    /* renamed from: r */
    private final int f15882r;

    /* renamed from: s */
    private final int f15883s;

    /* renamed from: t */
    private final int f15884t;

    /* renamed from: u */
    private final boolean f15885u;

    public pj4(int i, gv0 gv0, int i2, jj4 jj4, int i3, String str) {
        super(i, gv0, i2);
        ua3 ua3;
        int i4;
        int i5 = 0;
        this.f15878f = vj4.m22280r(i3, false);
        int i6 = this.f16988d.f9665d;
        int i7 = jj4.f12581u;
        this.f15879g = 1 == (i6 & 1);
        this.f15880h = (i6 & 2) != 0;
        if (jj4.f12579s.isEmpty()) {
            ua3 = ua3.m21509x("");
        } else {
            ua3 = jj4.f12579s;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= ua3.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = vj4.m22274j(this.f16988d, (String) ua3.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.f15881i = i8;
        this.f15882r = i4;
        int i9 = this.f16988d.f9666e;
        int bitCount = Integer.bitCount(0);
        this.f15883s = bitCount;
        int i10 = this.f16988d.f9666e;
        this.f15885u = false;
        int j = vj4.m22274j(this.f16988d, str, vj4.m22277n(str) == null);
        this.f15884t = j;
        boolean z = i4 > 0 || (jj4.f12579s.isEmpty() && bitCount > 0) || this.f15879g || (this.f15880h && j > 0);
        if (vj4.m22280r(i3, jj4.f11672N) && z) {
            i5 = 1;
        }
        this.f15877e = i5;
    }

    /* renamed from: a */
    public final int mo9198a() {
        return this.f15877e;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo9199b(rj4 rj4) {
        pj4 pj4 = (pj4) rj4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(pj4 pj4) {
        cc3 cc3;
        ja3 d = ja3.m14783i().mo10778d(this.f15878f, pj4.f15878f).mo10777c(Integer.valueOf(this.f15881i), Integer.valueOf(pj4.f15881i), cc3.m10845c().mo8303a()).mo10776b(this.f15882r, pj4.f15882r).mo10776b(this.f15883s, pj4.f15883s).mo10778d(this.f15879g, pj4.f15879g);
        Boolean valueOf = Boolean.valueOf(this.f15880h);
        Boolean valueOf2 = Boolean.valueOf(pj4.f15880h);
        if (this.f15882r == 0) {
            cc3 = cc3.m10845c();
        } else {
            cc3 = cc3.m10845c().mo8303a();
        }
        ja3 b = d.mo10777c(valueOf, valueOf2, cc3).mo10776b(this.f15884t, pj4.f15884t);
        if (this.f15883s == 0) {
            b = b.mo10779e(false, false);
        }
        return b.mo10775a();
    }
}
