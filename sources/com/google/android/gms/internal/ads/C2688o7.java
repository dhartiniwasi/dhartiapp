package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.o7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2688o7 implements an4 {

    /* renamed from: a */
    private final e92 f14977a;

    /* renamed from: b */
    private final y22 f14978b = new y22();

    /* renamed from: c */
    private final int f14979c;

    public C2688o7(int i, e92 e92, int i2) {
        this.f14979c = i;
        this.f14977a = e92;
    }

    /* renamed from: a */
    public final zm4 mo8442a(rn4 rn4, long j) throws IOException {
        int a;
        int i;
        long j2;
        long T = rn4.mo9003T();
        int min = (int) Math.min(112800, rn4.mo9005b() - T);
        this.f14978b.mo15290c(min);
        ((fn4) rn4).mo9986i(this.f14978b.mo15295h(), 0, min, false);
        y22 y22 = this.f14978b;
        int l = y22.mo15299l();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (y22.mo15296i() >= 188 && (i = a + 188) <= l) {
            long b = C2169a8.m9632b(y22, (a = C2169a8.m9631a(y22.mo15295h(), y22.mo15298k(), l)), this.f14979c);
            if (b != -9223372036854775807L) {
                long b2 = this.f14977a.mo9832b(b);
                if (b2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zm4.m24687d(b2, T);
                    }
                    j2 = T + j4;
                } else if (100000 + b2 > j) {
                    j2 = T + ((long) a);
                } else {
                    j4 = (long) a;
                    j5 = b2;
                }
                return zm4.m24688e(j2);
            }
            y22.mo15293f(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? zm4.m24689f(j5, T + j3) : zm4.f21165d;
    }

    /* renamed from: d */
    public final void mo8443d() {
        y22 y22 = this.f14978b;
        byte[] bArr = gb2.f9817f;
        int length = bArr.length;
        y22.mo15291d(bArr, 0);
    }
}
