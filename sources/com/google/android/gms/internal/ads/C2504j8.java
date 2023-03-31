package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.j8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2504j8 {
    /* renamed from: a */
    public static Pair m14738a(rn4 rn4) throws IOException {
        rn4.mo9981W();
        C2466i8 d = m14741d(1684108385, rn4, new y22(8));
        ((fn4) rn4).mo10218n(8, false);
        return Pair.create(Long.valueOf(rn4.mo9003T()), Long.valueOf(d.f10663b));
    }

    /* renamed from: b */
    public static C2429h8 m14739b(rn4 rn4) throws IOException {
        byte[] bArr;
        y22 y22 = new y22(16);
        C2466i8 d = m14741d(1718449184, rn4, y22);
        v91.m22052f(d.f10663b >= 16);
        fn4 fn4 = (fn4) rn4;
        fn4.mo9986i(y22.mo15295h(), 0, 16, false);
        y22.mo15293f(0);
        int q = y22.mo15304q();
        int q2 = y22.mo15304q();
        int p = y22.mo15303p();
        int p2 = y22.mo15303p();
        int q3 = y22.mo15304q();
        int q4 = y22.mo15304q();
        int i = ((int) d.f10663b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            fn4.mo9986i(bArr, 0, i, false);
        } else {
            bArr = gb2.f9817f;
        }
        byte[] bArr2 = bArr;
        ((fn4) rn4).mo10218n((int) (rn4.mo9004a() - rn4.mo9003T()), false);
        return new C2429h8(q, q2, p, p2, q3, q4, bArr2);
    }

    /* renamed from: c */
    public static boolean m14740c(rn4 rn4) throws IOException {
        y22 y22 = new y22(8);
        int i = C2466i8.m14219a(rn4, y22).f10662a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((fn4) rn4).mo9986i(y22.mo15295h(), 0, 4, false);
        y22.mo15293f(0);
        int m = y22.mo15300m();
        if (m == 1463899717) {
            return true;
        }
        ot1.m18057b("WavHeaderReader", "Unsupported form type: " + m);
        return false;
    }

    /* renamed from: d */
    private static C2466i8 m14741d(int i, rn4 rn4, y22 y22) throws IOException {
        C2466i8 a = C2466i8.m14219a(rn4, y22);
        while (true) {
            int i2 = a.f10662a;
            if (i2 == i) {
                return a;
            }
            ot1.m18060e("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = a.f10663b + 8;
            if (j <= 2147483647L) {
                ((fn4) rn4).mo10218n((int) j, false);
                a = C2466i8.m14219a(rn4, y22);
            } else {
                int i3 = a.f10662a;
                throw ea0.m11992c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }
}
