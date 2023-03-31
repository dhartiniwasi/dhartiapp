package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2271d {

    /* renamed from: a */
    public int f7989a;

    /* renamed from: b */
    public String f7990b;

    /* renamed from: c */
    public int f7991c;

    /* renamed from: d */
    public int f7992d;

    /* renamed from: e */
    public int f7993e;

    /* renamed from: f */
    public int f7994f;

    /* renamed from: g */
    public int f7995g;

    /* renamed from: a */
    public final boolean mo9405a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!C2308e.m11803m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f7989a = i2;
        this.f7990b = C2308e.f8539a[3 - i3];
        int i8 = C2308e.f8540b[i5];
        this.f7992d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.f7992d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.f7992d = i8;
        }
        int i10 = (i >>> 9) & 1;
        this.f7995g = C2308e.m11802l(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = C2308e.f8541c[i4 - 1];
            } else {
                i7 = C2308e.f8542d[i4 - 1];
            }
            this.f7994f = i7;
            this.f7991c = (((i7 * 12) / i8) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = C2308e.f8543e[i4 - 1];
                } else {
                    i6 = C2308e.f8544f[i4 - 1];
                }
                this.f7994f = i6;
                this.f7991c = ((i6 * 144) / i8) + i10;
            } else {
                int i12 = C2308e.f8545g[i4 - 1];
                this.f7994f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f7991c = ((i11 * i12) / i8) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f7993e = i9;
        return true;
    }
}
