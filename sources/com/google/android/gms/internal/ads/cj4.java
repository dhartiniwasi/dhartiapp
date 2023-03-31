package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cj4 extends rj4 implements Comparable {

    /* renamed from: A */
    private final int f7778A;

    /* renamed from: B */
    private final int f7779B;

    /* renamed from: C */
    private final boolean f7780C;

    /* renamed from: D */
    private final boolean f7781D;

    /* renamed from: e */
    private final int f7782e;

    /* renamed from: f */
    private final boolean f7783f;

    /* renamed from: g */
    private final String f7784g = vj4.m22277n(this.f16988d.f9664c);

    /* renamed from: h */
    private final jj4 f7785h;

    /* renamed from: i */
    private final boolean f7786i;

    /* renamed from: r */
    private final int f7787r;

    /* renamed from: s */
    private final int f7788s;

    /* renamed from: t */
    private final int f7789t;

    /* renamed from: u */
    private final boolean f7790u;

    /* renamed from: v */
    private final int f7791v;

    /* renamed from: w */
    private final int f7792w;

    /* renamed from: x */
    private final boolean f7793x;

    /* renamed from: y */
    private final int f7794y;

    /* renamed from: z */
    private final int f7795z;

    public cj4(int i, gv0 gv0, int i2, jj4 jj4, int i3, boolean z, c83 c83) {
        super(i, gv0, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.f7785h = jj4;
        int i7 = 0;
        this.f7786i = vj4.m22280r(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= jj4.f12574n.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = vj4.m22274j(this.f16988d, (String) jj4.f12574n.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.f7788s = i8;
        this.f7787r = i5;
        int i9 = this.f16988d.f9666e;
        this.f7789t = Integer.bitCount(0);
        C2388g4 g4Var = this.f16988d;
        int i10 = g4Var.f9666e;
        this.f7790u = true;
        this.f7793x = 1 == (g4Var.f9665d & 1);
        this.f7794y = g4Var.f9686y;
        this.f7795z = g4Var.f9687z;
        this.f7778A = g4Var.f9669h;
        this.f7783f = c83.mo8567b(g4Var);
        String[] G = gb2.m13137G();
        int i11 = 0;
        while (true) {
            if (i11 >= G.length) {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = vj4.m22274j(this.f16988d, G[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.f7791v = i11;
        this.f7792w = i6;
        int i12 = 0;
        while (true) {
            if (i12 < jj4.f12578r.size()) {
                String str = this.f16988d.f9673l;
                if (str != null && str.equals(jj4.f12578r.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f7779B = i4;
        this.f7780C = (i3 & 128) == 128;
        this.f7781D = (i3 & 64) == 64;
        jj4 jj42 = this.f7785h;
        if (vj4.m22280r(i3, jj42.f11672N) && ((z2 = this.f7783f) || jj42.f11666H)) {
            i7 = (!vj4.m22280r(i3, false) || !z2 || this.f16988d.f9669h == -1 || (!jj42.f11674P && z)) ? 1 : 2;
        }
        this.f7782e = i7;
    }

    /* renamed from: a */
    public final int mo9198a() {
        return this.f7782e;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo9199b(rj4 rj4) {
        String str;
        cj4 cj4 = (cj4) rj4;
        boolean z = this.f7785h.f11669K;
        C2388g4 g4Var = this.f16988d;
        int i = g4Var.f9686y;
        if (i == -1) {
            return false;
        }
        C2388g4 g4Var2 = cj4.f16988d;
        if (i != g4Var2.f9686y || (str = g4Var.f9673l) == null || !TextUtils.equals(str, g4Var2.f9673l)) {
            return false;
        }
        boolean z2 = this.f7785h.f11668J;
        int i2 = this.f16988d.f9687z;
        return i2 != -1 && i2 == cj4.f16988d.f9687z && this.f7780C == cj4.f7780C && this.f7781D == cj4.f7781D;
    }

    /* renamed from: c */
    public final int compareTo(cj4 cj4) {
        cc3 cc3;
        if (!this.f7783f || !this.f7786i) {
            cc3 = vj4.f19123k.mo8303a();
        } else {
            cc3 = vj4.f19123k;
        }
        ja3 c = ja3.m14783i().mo10778d(this.f7786i, cj4.f7786i).mo10777c(Integer.valueOf(this.f7788s), Integer.valueOf(cj4.f7788s), cc3.m10845c().mo8303a()).mo10776b(this.f7787r, cj4.f7787r).mo10776b(this.f7789t, cj4.f7789t).mo10778d(this.f7793x, cj4.f7793x).mo10778d(true, true).mo10777c(Integer.valueOf(this.f7791v), Integer.valueOf(cj4.f7791v), cc3.m10845c().mo8303a()).mo10776b(this.f7792w, cj4.f7792w).mo10778d(this.f7783f, cj4.f7783f).mo10777c(Integer.valueOf(this.f7779B), Integer.valueOf(cj4.f7779B), cc3.m10845c().mo8303a());
        Integer valueOf = Integer.valueOf(this.f7778A);
        Integer valueOf2 = Integer.valueOf(cj4.f7778A);
        boolean z = this.f7785h.f12583w;
        ja3 c2 = c.mo10777c(valueOf, valueOf2, vj4.f19124l).mo10778d(this.f7780C, cj4.f7780C).mo10778d(this.f7781D, cj4.f7781D).mo10777c(Integer.valueOf(this.f7794y), Integer.valueOf(cj4.f7794y), cc3).mo10777c(Integer.valueOf(this.f7795z), Integer.valueOf(cj4.f7795z), cc3);
        Integer valueOf3 = Integer.valueOf(this.f7778A);
        Integer valueOf4 = Integer.valueOf(cj4.f7778A);
        if (!gb2.m13186t(this.f7784g, cj4.f7784g)) {
            cc3 = vj4.f19124l;
        }
        return c2.mo10777c(valueOf3, valueOf4, cc3).mo10775a();
    }
}
