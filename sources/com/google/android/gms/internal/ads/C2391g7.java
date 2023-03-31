package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.g7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2391g7 {

    /* renamed from: a */
    private final e92 f9737a = new e92(0);

    /* renamed from: b */
    private final y22 f9738b = new y22();

    /* renamed from: c */
    private boolean f9739c;

    /* renamed from: d */
    private boolean f9740d;

    /* renamed from: e */
    private boolean f9741e;

    /* renamed from: f */
    private long f9742f = -9223372036854775807L;

    /* renamed from: g */
    private long f9743g = -9223372036854775807L;

    /* renamed from: h */
    private long f9744h = -9223372036854775807L;

    C2391g7() {
    }

    /* renamed from: c */
    public static long m13065c(y22 y22) {
        y22 y222 = y22;
        int k = y22.mo15298k();
        if (y22.mo15296i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        y222.mo15289b(bArr, 0, 9);
        y222.mo15293f(k);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: f */
    private final int m13066f(rn4 rn4) {
        y22 y22 = this.f9738b;
        byte[] bArr = gb2.f9817f;
        int length = bArr.length;
        y22.mo15291d(bArr, 0);
        this.f9739c = true;
        rn4.mo9981W();
        return 0;
    }

    /* renamed from: g */
    private static final int m13067g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public final int mo10402a(rn4 rn4, C2532k kVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f9741e) {
            long b = rn4.mo9005b();
            int min = (int) Math.min(20000, b);
            long j2 = b - ((long) min);
            if (rn4.mo9003T() != j2) {
                kVar.f11852a = j2;
                return 1;
            }
            this.f9738b.mo15290c(min);
            rn4.mo9981W();
            ((fn4) rn4).mo9986i(this.f9738b.mo15295h(), 0, min, false);
            y22 y22 = this.f9738b;
            int k = y22.mo15298k();
            int l = y22.mo15299l() - 4;
            while (true) {
                if (l < k) {
                    break;
                }
                if (m13067g(y22.mo15295h(), l) == 442) {
                    y22.mo15293f(l + 4);
                    long c = m13065c(y22);
                    if (c != -9223372036854775807L) {
                        j = c;
                        break;
                    }
                }
                l--;
            }
            this.f9743g = j;
            this.f9741e = true;
            return 0;
        } else if (this.f9743g == -9223372036854775807L) {
            m13066f(rn4);
            return 0;
        } else if (!this.f9740d) {
            int min2 = (int) Math.min(20000, rn4.mo9005b());
            if (rn4.mo9003T() != 0) {
                kVar.f11852a = 0;
                return 1;
            }
            this.f9738b.mo15290c(min2);
            rn4.mo9981W();
            ((fn4) rn4).mo9986i(this.f9738b.mo15295h(), 0, min2, false);
            y22 y222 = this.f9738b;
            int k2 = y222.mo15298k();
            int l2 = y222.mo15299l();
            while (true) {
                if (k2 >= l2 - 3) {
                    break;
                }
                if (m13067g(y222.mo15295h(), k2) == 442) {
                    y222.mo15293f(k2 + 4);
                    long c2 = m13065c(y222);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
                        break;
                    }
                }
                k2++;
            }
            this.f9742f = j;
            this.f9740d = true;
            return 0;
        } else {
            long j3 = this.f9742f;
            if (j3 == -9223372036854775807L) {
                m13066f(rn4);
                return 0;
            }
            long b2 = this.f9737a.mo9832b(this.f9743g) - this.f9737a.mo9832b(j3);
            this.f9744h = b2;
            if (b2 < 0) {
                ot1.m18060e("PsDurationReader", "Invalid duration: " + b2 + ". Using TIME_UNSET instead.");
                this.f9744h = -9223372036854775807L;
            }
            m13066f(rn4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo10403b() {
        return this.f9744h;
    }

    /* renamed from: d */
    public final e92 mo10404d() {
        return this.f9737a;
    }

    /* renamed from: e */
    public final boolean mo10405e() {
        return this.f9739c;
    }
}
