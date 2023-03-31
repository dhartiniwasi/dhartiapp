package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.o0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2681o0 implements an4 {

    /* renamed from: a */
    private final do4 f14773a;

    /* renamed from: b */
    private final int f14774b;

    /* renamed from: c */
    private final yn4 f14775c = new yn4();

    /* synthetic */ C2681o0(do4 do4, int i, C2644n0 n0Var) {
        this.f14773a = do4;
        this.f14774b = i;
    }

    /* renamed from: b */
    private final long m17393b(rn4 rn4) throws IOException {
        rn4 rn42 = rn4;
        while (rn4.mo9004a() < rn4.mo9005b() - 6) {
            do4 do4 = this.f14773a;
            int i = this.f14774b;
            yn4 yn4 = this.f14775c;
            long a = rn4.mo9004a();
            byte[] bArr = new byte[2];
            fn4 fn4 = (fn4) rn42;
            fn4.mo9986i(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                rn4.mo9981W();
                fn4.mo10217m((int) (a - rn4.mo9003T()), false);
            } else {
                y22 y22 = new y22(16);
                System.arraycopy(bArr, 0, y22.mo15295h(), 0, 2);
                y22.mo15292e(un4.m21755a(rn42, y22.mo15295h(), 2, 14));
                rn4.mo9981W();
                fn4.mo10217m((int) (a - rn4.mo9003T()), false);
                if (zn4.m24717c(y22, do4, i, yn4)) {
                    break;
                }
            }
            fn4.mo10217m(1, false);
        }
        if (rn4.mo9004a() < rn4.mo9005b() - 6) {
            return this.f14775c.f20723a;
        }
        ((fn4) rn42).mo10217m((int) (rn4.mo9005b() - rn4.mo9004a()), false);
        return this.f14773a.f8352j;
    }

    /* renamed from: a */
    public final zm4 mo8442a(rn4 rn4, long j) throws IOException {
        long T = rn4.mo9003T();
        long b = m17393b(rn4);
        long a = rn4.mo9004a();
        ((fn4) rn4).mo10217m(Math.max(6, this.f14773a.f8345c), false);
        long b2 = m17393b(rn4);
        long a2 = rn4.mo9004a();
        if (b > j || b2 <= j) {
            return b2 <= j ? zm4.m24689f(b2, a2) : zm4.m24687d(b, T);
        }
        return zm4.m24688e(a);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo8443d() {
    }
}
