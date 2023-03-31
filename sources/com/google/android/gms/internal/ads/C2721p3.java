package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.p3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2721p3 {

    /* renamed from: a */
    private final y22 f15667a = new y22(8);

    /* renamed from: b */
    private int f15668b;

    /* renamed from: b */
    private final long m18314b(rn4 rn4) throws IOException {
        fn4 fn4 = (fn4) rn4;
        int i = 0;
        fn4.mo9986i(this.f15667a.mo15295h(), 0, 1, false);
        byte b = this.f15667a.mo15295h()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        fn4.mo9986i(this.f15667a.mo15295h(), 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f15667a.mo15295h()[i] & 255) + (i4 << 8);
        }
        this.f15668b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo13123a(rn4 rn4) throws IOException {
        long b;
        int i;
        long b2 = rn4.mo9005b();
        long j = 1024;
        int i2 = (b2 > -1 ? 1 : (b2 == -1 ? 0 : -1));
        if (i2 != 0 && b2 <= 1024) {
            j = b2;
        }
        int i3 = (int) j;
        fn4 fn4 = (fn4) rn4;
        fn4.mo9986i(this.f15667a.mo15295h(), 0, 4, false);
        this.f15668b = 4;
        for (long A = this.f15667a.mo15280A(); A != 440786851; A = ((A << 8) & -256) | ((long) (this.f15667a.mo15295h()[0] & 255))) {
            int i4 = this.f15668b + 1;
            this.f15668b = i4;
            if (i4 == i3) {
                return false;
            }
            fn4.mo9986i(this.f15667a.mo15295h(), 0, 1, false);
        }
        long b3 = m18314b(rn4);
        long j2 = (long) this.f15668b;
        if (b3 != Long.MIN_VALUE && (i2 == 0 || j2 + b3 < b2)) {
            while (true) {
                int i5 = (((long) this.f15668b) > (j2 + b3) ? 1 : (((long) this.f15668b) == (j2 + b3) ? 0 : -1));
                if (i5 < 0) {
                    if (m18314b(rn4) == Long.MIN_VALUE || b < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int b4 = (int) (b = m18314b(rn4));
                        fn4.mo10217m(b4, false);
                        this.f15668b += b4;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
