package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ao4 {
    /* renamed from: a */
    public static k60 m9870a(rn4 rn4, boolean z) throws IOException {
        k60 a = new ho4().mo10887a(rn4, z ? null : C2423h2.f10152a);
        if (a == null || a.mo11568a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static co4 m9871b(y22 y22) {
        y22.mo15294g(1);
        int u = y22.mo15308u();
        long k = ((long) y22.mo15298k()) + ((long) u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = y22.mo15313z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = y22.mo15313z();
            y22.mo15294g(2);
            i2++;
        }
        y22.mo15294g((int) (k - ((long) y22.mo15298k())));
        return new co4(jArr, jArr2);
    }
}
