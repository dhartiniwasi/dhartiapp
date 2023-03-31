package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.q7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2763q7 {

    /* renamed from: a */
    private final e92 f16220a = new e92(0);

    /* renamed from: b */
    private final y22 f16221b = new y22();

    /* renamed from: c */
    private boolean f16222c;

    /* renamed from: d */
    private boolean f16223d;

    /* renamed from: e */
    private boolean f16224e;

    /* renamed from: f */
    private long f16225f = -9223372036854775807L;

    /* renamed from: g */
    private long f16226g = -9223372036854775807L;

    /* renamed from: h */
    private long f16227h = -9223372036854775807L;

    C2763q7(int i) {
    }

    /* renamed from: e */
    private final int m19094e(rn4 rn4) {
        y22 y22 = this.f16221b;
        byte[] bArr = gb2.f9817f;
        int length = bArr.length;
        y22.mo15291d(bArr, 0);
        this.f16222c = true;
        rn4.mo9981W();
        return 0;
    }

    /* renamed from: a */
    public final int mo13482a(rn4 rn4, C2532k kVar, int i) throws IOException {
        if (i <= 0) {
            m19094e(rn4);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f16224e) {
            long b = rn4.mo9005b();
            int min = (int) Math.min(112800, b);
            long j2 = b - ((long) min);
            if (rn4.mo9003T() != j2) {
                kVar.f11852a = j2;
                return 1;
            }
            this.f16221b.mo15290c(min);
            rn4.mo9981W();
            ((fn4) rn4).mo9986i(this.f16221b.mo15295h(), 0, min, false);
            y22 y22 = this.f16221b;
            int k = y22.mo15298k();
            int l = y22.mo15299l();
            int i2 = l - 188;
            while (true) {
                if (i2 < k) {
                    break;
                }
                byte[] h = y22.mo15295h();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < k || i5 >= l || h[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b2 = C2169a8.m9632b(y22, i2, i);
                            if (b2 != -9223372036854775807L) {
                                j = b2;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f16226g = j;
            this.f16224e = true;
            return 0;
        } else if (this.f16226g == -9223372036854775807L) {
            m19094e(rn4);
            return 0;
        } else if (!this.f16223d) {
            int min2 = (int) Math.min(112800, rn4.mo9005b());
            if (rn4.mo9003T() != 0) {
                kVar.f11852a = 0;
                return 1;
            }
            this.f16221b.mo15290c(min2);
            rn4.mo9981W();
            ((fn4) rn4).mo9986i(this.f16221b.mo15295h(), 0, min2, false);
            y22 y222 = this.f16221b;
            int k2 = y222.mo15298k();
            int l2 = y222.mo15299l();
            while (true) {
                if (k2 >= l2) {
                    break;
                }
                if (y222.mo15295h()[k2] == 71) {
                    long b3 = C2169a8.m9632b(y222, k2, i);
                    if (b3 != -9223372036854775807L) {
                        j = b3;
                        break;
                    }
                }
                k2++;
            }
            this.f16225f = j;
            this.f16223d = true;
            return 0;
        } else {
            long j3 = this.f16225f;
            if (j3 == -9223372036854775807L) {
                m19094e(rn4);
                return 0;
            }
            long b4 = this.f16220a.mo9832b(this.f16226g) - this.f16220a.mo9832b(j3);
            this.f16227h = b4;
            if (b4 < 0) {
                ot1.m18060e("TsDurationReader", "Invalid duration: " + b4 + ". Using TIME_UNSET instead.");
                this.f16227h = -9223372036854775807L;
            }
            m19094e(rn4);
            return 0;
        }
    }

    /* renamed from: b */
    public final long mo13483b() {
        return this.f16227h;
    }

    /* renamed from: c */
    public final e92 mo13484c() {
        return this.f16220a;
    }

    /* renamed from: d */
    public final boolean mo13485d() {
        return this.f16222c;
    }
}
